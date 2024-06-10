import java.awt.*;
class windowdemo extends Frame
{
      windowdemo()
      {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        
      }
      public static void main(String[] arg)
      {
        new windowdemo();
      }
}