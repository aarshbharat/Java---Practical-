import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet{
    public void init(){
        resize(200, 200);
    }
    public void paint(Graphics g){
        g.drawString("Hello World!", 150, 150); // here 150 and 150 are coordinates x and y from where the text writing start
        g.drawString("Of Java", 160, 160);
    }
} 