import java.awt.*;


public class CheckboxDemo{
    CheckboxDemo(){
        Frame f = new Frame("Check Box in Frame");
        Checkbox ch1 = new Checkbox("C++");
        ch1.setBounds(100,100,50,50);
        Checkbox ch2 = new Checkbox("Java",true);
        ch2.setBounds(100,150,50,50);
        f.add(ch1);
        f.add(ch2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckboxDemo();
    }
}