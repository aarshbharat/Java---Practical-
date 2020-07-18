import java.awt.*;
class ScrollbarDemo{
    ScrollbarDemo(){
        Frame f = new Frame("Scrollbar Example");
        Scrollbar h = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
        h.setBounds(100,50,300,50);
        Scrollbar v = new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
        v.setBounds(100,200,25,300);
        f.add(h);
        f.add(v);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ScrollbarDemo();
    }
}