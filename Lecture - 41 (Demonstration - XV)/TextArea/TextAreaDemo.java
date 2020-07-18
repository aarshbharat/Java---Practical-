import java.awt.*;
public class TextAreaDemo{
    TextAreaDemo(){
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome To Gandhidham");
        area.setBounds(30,60,300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TextAreaDemo();
    }
} 