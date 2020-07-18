import java.applet.Applet;
import java.awt.Graphics;
public class Applet3 extends Applet{
    public void init(){
        /**
         * To resize an applet window use,
         * void resize(int x, int y) method of applet class 
         */
        resize(300,300);
    }
    public void paint(Graphics g){
        g.drawString("Windows has resized to 300,300", 50, 50);
    }
}