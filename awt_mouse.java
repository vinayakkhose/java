import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener
{
    Label l1;
   MouseDemo()
   {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
     l1=new Label("this is mouse Event       ");
     add(l1);
     addMouseListener(this);
   }
   public void mousePressed(MouseEvent me)
   {
       l1.setText("this is mouse presed ev");
   }
   public void mouseReleased(MouseEvent me)
   {
    l1.setText("this is mouse relesed ev");
   }
   public void mouseClicked(MouseEvent me)
   {
    l1.setText("this is mouse Click ev");  
   }
   public void mouseEntered(MouseEvent me)
   {
    l1.setText("this is mouse Entered ev");  
   }
   public void mouseExited(MouseEvent me)
   {
    l1.setText("this is mouse Exited ev");  
   }
 
   public static void main(String arg[])
   {
    new MouseDemo();
   }
}