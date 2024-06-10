import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;
 class awt2 extends Frame implements ActionListener
{
    Button b1,b2,b3,b4;
    Label l1,l2;
    List li1;
    TextField t1;
awt2()
{
setVisible(true);
setSize(500,500);
setLayout(new FlowLayout());
setBackground(Color.green);
l1=new Label("enter product");
l2=new Label("allproduct");
b1=new Button("add");
b2=new Button("clear");
b3=new Button("removed");
b4=new Button("exit");
t1=new TextField(10);
li1=new List(5);
add(l1);
add(t1);
add(l2);
add(li1);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
} 
public void  actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
    String s1=t1.getText();
    li1.add(s1);
    }
    if(ae.getSource()==b2)
    {
      li1.remove(li1.getSelectedItem());
    }
    if(ae.getSource()==b3)
    {
    li1.removeAll();
    }
    if(ae.getSource()==b4)
    {
        dispose();
    }
}
public static void main(String[] arg) {
    new awt2();
}   
}