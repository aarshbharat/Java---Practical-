//create child frame window from within the applet
import java.awt.*;
import java.awt.event.*;

import javafx.stage.WindowEvent;

import java.applet.*;

/**
 * <applet code="AppletFrame" width=300 height=50></applet>
 */
//create a sub class of Frame
class SampleFrame extends Frame{
    SampleFrame(String title){
        super(title);
        //create an object to handle window event
        MyWindowAdapter adapter = new MyWindowAdapter(this);// register it  to receive those events
        addWindowListener(adapter);
    }
    public void paint(Graphics g){
        g.drawString("This is in frame window",10,40);
    }
}
class MyWindowAdapter extends WindowAdapter{
    SampleFrame sampleFrame;
    public MyWindowAdapter(SampleFrame sampleFrame){
        this.sampleFrame = sampleFrame;
    }
    public void windowClosing(WindowEvent we){
        sampleFrame.setVisible(false);
    }
}
//create frame window
public class AppletFrame extends Applet{
    Frame f;
    public void init(){
        f = new SampleFrame("A Frame Window");
        f.setSize(250,250);
        f.setVisible(true);
    }
    public void start(){
        f.setVisible(true);
    }
    public void stop(){
        f.setVisible(false);
    }
    public void paint(Graphics g){
        g.drawString("This is in applet window", 10, 20);
    }
}