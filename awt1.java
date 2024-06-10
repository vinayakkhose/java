import java.awt.*;
import java.awt.event.*;
class demo implements ActionListener 
{  
    public static void main(String arg[])
    {
        Frame ob=new Frame();
        
        ob.setVisible(true);
        ob.setSize(500,500);
        ob.setBackground(Color.red);
        ob.setLayout(new FlowLayout());
        ob.setLocation(500,500);
        Label l1=new Label("Enter number1 :");
        Label l2=new Label("Enter number2 :");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("addition");
        
        ob.add(l1);
        ob.add(t1);
        ob.add(l2);
        ob.add(t2);
        ob.add(b1);
    }
  
  }