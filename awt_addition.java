import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
   demo()
   {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    setBackground(Color.red);
    l1=new Label("Enter 1st num   :");
    l2=new Label("Enter 2nd num  :");
    l3=new Label("Addion  :");
    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);
    b1=new Button("addion");
    b2=new Button("exit");
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(b1);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae)
   {
    if(ae.getSource()==b1)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        t3.setText(""+c);
    }
    if(ae.getSource()==b2)
    {
       dispose();
    }
   }
   public static void main(String arg[])
   {
    demo ob=new demo();
   }
}