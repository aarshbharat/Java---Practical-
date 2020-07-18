//the following program demonstrate the effect of stop() in applet program
//create a child frame window from within an applet
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<APPLET code="AppletFrame.class" width=300 height=200> */
//create a subclass of frame 
class SampleFrame extends Frame{
    SampleFrame(String title){
        super(title);
        //create an object to handle window events
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        //Register it to recieve those events
        addWindowListener(adapter);
    }
    public void paint(Graphics g){
        g.drawString("This is in frame window", 10, 40);
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
//crete frame window
public class AppletFrame extends Applet{
    Frame f;
    public void init(){
        f = new SampleFrame("A Frame Window");
        f.setSize(250,250);
        f.setVisible(true);
    }
    public void start(){f.setVisible(true);}
    public void stop(){f.setVisible(false);}
    public void paint(Graphics g){g.drawString("This is an Applet Window",10,20);}
}
/**
 <HTML>
    <BODY>
        <APPLET width="300" height="300" codebase="." code="AppletFrame.class"></APPLET>
    </BODY>
 </HTML> 
 */
