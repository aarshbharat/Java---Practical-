import java.awt.*;
import java.applet.*;
public class StatusWindow extends Applet{
    public void init(){
        setBackground(Color.cyan);
    }
    public void paint(Graphics g){
        g.drawString("This is the applet window", 10, 20);
        showStatus("This is shown in the status window");
    }
}
/*
<html>
    <body>
        <applet width=300 height=50 code="StatusWindow.class"></applet>
    </body>
</html>
*/