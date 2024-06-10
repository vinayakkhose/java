import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements MouseMotionListener
{
    TextField t1;
     demo()
     {
        setVisible(true);
        setSize(500,500);
        setBackground(Color.red);
        setTitle("mouse motion");
        setLayout(new FlowLayout());
        t1=new TextField(20);
        add(t1);
        addMouseMotionListener(this);
     }
     public void mouseDragged(MouseEvent me)
     {

     }
     public void mouseMoved(MouseEvent me)
     {
         t1.setText("x axix :"+me.getX()+" y axix :"+me.getY()); 
     }
     
     public static void main(String arg[])
     {
        new demo();
     }
}