
//Use of init() method is an applet
import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet {
    
    public void init() {
        resize(200,200);
    }

    public void paint(Graphics g) {
        g.drawString("Hello World!", 150, 150);
    }
}