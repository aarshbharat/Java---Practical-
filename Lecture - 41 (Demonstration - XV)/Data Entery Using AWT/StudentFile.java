//Code is not completed
import java.io.*;
import java.awt.*;
class StudentFile extends Frame{
    //Defining window component
    TextField number,name,marks;
    Button enter,done;
    Label numLabel,nameLabel,markLabel;
    DataOutputStream dos;
    //Initialize the Frame 
    public StudentFile(){
        super("Create Student File");
    }
    //setup the window
    public void setup(){
        resize(400,200);
        setLayout(new GridLayout(4,2));
        //Create the component of the frame 
        number = new TextField(25);
        number = new TextField(25);
        numLabel = new Label("Roll No.");
        name = new TextField(25);
        nameLabel = new Label("Student Name");
        marks = new TextField(25);
        markLabel = new Label("Marks");
        
    }
}
