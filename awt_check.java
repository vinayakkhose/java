import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
    Checkbox c1,c2,c3,c4;
    Button b1;
    TextArea ta;
       
    Demo()
    {
      setVisible(true);
      setSize(500,500);
      setLayout(new FlowLayout());

      c1=new Checkbox("java");
      c2=new Checkbox("php");
      c3=new Checkbox("python");
      c4=new Checkbox("tcs");
      b1=new Button("ok");
      ta=new TextArea(4,50);
      ta.setFont(new Font("Arial",Font.BOLD,17));
      add(c1);
      add(c2);
      add(c3);
      add(c4);
      add(b1);
      add(ta);
      b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
             String s1="";
             if(c1.getState()==true)
             {
                s1="java";
             }
              if(c2.getState()==true)
             {
                s1=s1+" ,php";
             }
              if(c3.getState()==true)
             {
                s1=s1+" ,python";
             }
             if(c4.getState()==true)
             {
                s1=s1+" ,tcs";
             }
          ta.setText("selected subject   :   ");
          ta.append(s1);  
     }
    }
    public static void main(String arg[])
    {
        new Demo();
    }
}