import java.awt.*;
public class Cards extends java.applet.Applet{
    CardLayout layout;
    public void init(){
        layout = new CardLayout();
        setLayout(layout);
        add("1",new Button("Card 1"));
        add("2",new Button("Card 2"));
        add("3",new Button("Card 3"));
        add("4",new Button("Card 4"));
        add("5",new Button("Card 5"));
    }
    public boolean keyDown(Event e,int key){
        layout.previous(this);
        return(true);
    }
}
/**
 <html>
 <body>
 <applet code="Cards.class" height=300 width=300>
 </applet>
 </body>
 </html>
 */