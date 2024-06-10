import java.awt.*;
import java.awt.event.*;
class framedemo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    Button b1,b2,b3;
    TextField t1,t2,t3;
    framedemo()
    {
        setVisible(true);
        setSize(500,500);
        setLocation(300,500);
        setLayout(new FlowLayout());
     l1=new Label("Enter first string  :");
     l2=new Label("Enter second string  :");
     l3=new Label("result  :");
      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(20);
      b1=new Button("concat");
      b2=new Button("Revers");
      b3=new Button("exit");
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(l3);
      add(t3);
      add(b1);
      add(b2);
      add(b3);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b1)
         {
            String s1=t1.getText();
            String s2=t2.getText();
            String s3=""+s1+" "+s2;
            t3.setText(""+s3);
         }
         if(ae.getSource()==b2)
         {
             String s1=t1.getText();
            String s2=t2.getText();
            String s3=""+s1+" "+s2;
            StringBuffer sb=new StringBuffer(s3);
             sb.reverse();
             t3.setText(""+sb);
         }
         if(ae.getSource()==b3)
         {
            dispose();
         }
    }
    public static void main(String arg[])
    {
        framedemo ob=new framedemo();
    }
}