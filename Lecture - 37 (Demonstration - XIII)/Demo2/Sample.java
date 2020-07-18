import java.applet.*;
import java.awt.*;
public class Sample extends Applet{
    String msg;
    //set the foreground and background colors
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init()---";
    }
    //initialize the string to be displayed
    public void start(){
        msg += "Inside start()----";
    }
    //diplay message in applet window
    public void paint(Graphics g){
        msg += "Inside the paint()---";
        g.drawString(msg, 10, 30);
    }
}
/**
 <HTML>
    <BODY>
        <APPLET width=300 height=300 coedbase="." code="Sample.class">
        </APPLET>
    </BODY>
 </HTML>
 */