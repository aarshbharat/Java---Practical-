import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World !", 150, 150);
    }
}
/**
 <html>
    <body>
        <applet width=500 height=300 codebase="." code="HelloWorld.class">
        </applet>
    </body>
 </html>
 */