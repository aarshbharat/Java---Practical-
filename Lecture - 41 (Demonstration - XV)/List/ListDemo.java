import java.awt.*;
public class ListDemo{
    ListDemo(){
        Frame f = new Frame();
        List l1 = new List(4);
        l1.setBounds(100,100,75,75);
        l1.add("Item1");
        l1.add("Item2");
        l1.add("Item3");
        l1.add("Item4");
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[]args){
        new ListDemo();
    }
}