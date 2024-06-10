import java.awt.*;
import java.awt.event.*;

class demo11 implements ActionListener
{
    Frame f;
    Label l1,l2;
    TextField t1,t2,t3;
    Button b1;
    demo11()
    {
      f=new Frame();
      f.setVisible(true);
      f.setSize(300,500);
      f.setLayout(new FlowLayout());
      f.setBackground(Color.red);
       l1=new Label("enter first name");
       t1=new TextField(10);
      f.add(l1);
      f.add(t1); 
       l2=new Label("enter last name");
       t2=new TextField(10); 
       t3=new TextField(20); 
       b1=new Button("submit");
      f.add(l2);
      f.add(t2);
      f.add(b1);
      f.add(t3);
    b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev)
    {
      if(ev.getSource()==b1)
      {
        String s1=""+t1.getText()+" "+t2.getText();
        t3.setText(s1);
          
      }
    }
    public static void main(String arg[])
    {
        demo11 ob=new demo11();
    }
}