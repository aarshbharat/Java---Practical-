import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applet5 extends Applet{
    public void init(){
        //here we change the default background color to yellow background color 
        //to change a background color we are using setBackground() method is used
        setBackground(Color.YELLOW);
        resize(400,400);
    }

    public void paint(Graphics g){
        g.drawString("Applet Background Example", 0, 50);
    }
}