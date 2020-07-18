import java.awt.*;
public class ChoiceDemo{
    ChoiceDemo(){
        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(100,100,75,75);
        c.add("Item1");
        c.add("Item2");
        c.add("Item3");
        c.add("Item4");
        f.add(c);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ChoiceDemo();
    }
}