import java.awt.*;
public class CheckboxGroupDemo{
    CheckboxGroupDemo(){
        Frame f = new Frame("Chekbox Group Demo");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("C++",cbg,false);
        ch1.setBounds(50,100,50,50);
        Checkbox ch2 = new Checkbox("Java",cbg,true);
        ch2.setBounds(50,150,50,50);
        
          Checkbox ch3 = new Checkbox("NPTEL",cbg,false);
          ch3.setBounds(50,50,50,50);
          
        f.add(ch1);
        f.add(ch2);
        f.add(ch3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckboxGroupDemo();
    }
}