import java.io.*;
import java.awt.*;
class StudentFile extends Frame{
    //Defining window components
    TextField number,name,marks;
    Button enter,done;
    Label numLabel,nameLabel,markLabel;
    DataOutputStream dos;
    //Initialize the frame
    public StudentFile(){
        super("Create Student File");
    }
    //setup the window
    public void setup(){
        resize(400,200);
        setLayout(new GridLayout(4,2));
        //create the component of the frame
        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("Student Name");
        marks = new TextField(25);
        markLabel = new Label("Marks");
        enter = new Button("ENTER");
        done = new Button("DONE");
        //Add the component  to the frame
        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(markLabel);
        add(marks);
        add(enter);
        add(done);
        //show the frame 
        show();
        //open the file
        try{
            dos = new DataOutputStream(new FileOutputStream("Student.dat"));
        }catch(IOException e){
            System.err.println(e.toString());
            System.exit(1);
        }
    }
    //Write to the file
    public void addRecord(){
        int num;
        Double d;
        num = new Integer(getText()).intValue();
        try{
            dos.writeInt(num);
            dos.writeUTF(name.getText());
            d = new Double(marks.getText());
            dos.writeDouble(d.doubleValue());
        }catch(IOException e){ }
            //Clear the text field
            number.setText(" ");
            name.setText(" ");
            marks.setText(" ");
    } 
        //Adding the record and clearing the text field
        public void cleanup(){
            if(!number.getText().equals(" ")){
                addRecord();
            }
            try{
                dos.flush();
                dos.close();
            }catch(IOException e){}
        }
        //processing the event  
        public boolean action(Event event,Object o){
            if(event.target instanceof Button){
                if(event.arg.equals("ENTER")){
                    addRecord();
                    return true;
                }
            }
            return super.action(event,o);
        }
        public boolean handleEvent(Event event){
            if(event.target instanceof Button){
                if(event.arg.equals("DONE")){
                    cleanup();
                    System.exit(0);
                    return true;
                }
            }
            return super.handleEvent(event);
        }
        //Execute the program
        public static void main(String[]args){
            StudentFile student = new StudentFile();
            student.setup();
        }
}
