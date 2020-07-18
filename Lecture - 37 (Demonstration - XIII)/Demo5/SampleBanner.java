//the message contained in msg right to left across the applet window
import java.applet.*;
import java.awt.*;
public class SampleBanner extends Applet implements Runnable{
    String msg = "A simple moving banner ";
    Thread t = null;
    int state;
    boolean stopFlag;
    //set colors and initialize thread
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    //Strat thread
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    //Entry point for the thread that runs the banner 
    public void run(){
        char ch;
        //Display Banner
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1,msg.length());
                msg += ch;
                if(stopFlag){
                    break;
                }
            }catch(InterruptedException e){

            }
        }
    }
    //pause the banner
    public void stop(){
        stopFlag = true;
        t=null;
    }
    //Display the banner
    public void paint(Graphics g){
        g.drawString(msg,50,30);
    }
}

/**
 <html>
    <body>
        <applet width=300 height = 200 codebase="." code="SampleBanner.class"></applet>
    </body>
 </html>
 */