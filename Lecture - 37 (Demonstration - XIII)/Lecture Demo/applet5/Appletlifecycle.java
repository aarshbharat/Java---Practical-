import java.awt.*;
import java.applet.*;
public class AppletLifecycle extends Applet{
    StringBuffer strBuffer;
    public void init(){
        strBuffer = new StringBuffer();
        addItem("Initializing the applet");
    }
    public void start(){
        addItem("Starting Applet");
    }
    public void stop(){
        addItem("Stopping the applet");
    }
    public void destroy(){
        addItem("unloading the applet");
    }
    void addItem(String word){
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }
    public void paint(Graphics g){
        //Draw a Rectangle around the applet's display area.
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        //display the string inside the rectangle
        g.drawString(strBuffer.toString(),10,20);
    }
}