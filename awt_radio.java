import java.awt.*;
import java.awt.event.*;
class RadioDemo extends Frame implements ActionListener
{
    Label l1,l2;
    Checkbox c1,c2,c3,c4,c5;
    CheckboxGroup cg,cg1;
    Button b1;
    TextArea ta;
    RadioDemo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
         l1=new Label("select gender :");
         l2=new Label("select Year :");
         cg=new CheckboxGroup();
         cg1=new CheckboxGroup();
         ta=new TextArea(4,17);
         setFont(new Font("Arial",Font.BOLD,17));
        c1=new Checkbox("male",cg,false);
        c2=new Checkbox("female",cg,false);
         
        c3=new Checkbox("FY",cg1,false);
        c4=new Checkbox("SY",cg1,false);
        c5=new Checkbox("TY",cg1,false);
        b1=new Button("ok");
        add(l1);add(c1);add(c2);add(l2);add(c3);add(c4);add(c5);add(ta);add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String s1="";
            if(c1.getState())
                s1="Male";
            if(c2.getState())
                s1=" FeMale";

                ta.setText("selected gender :");
                ta.append(s1);
            if(c3.getState())
                s1="  FY";
            if(c4.getState())
                s1="  SY";
            if(c5.getState())
                s1="  TY";
                               
                ta.setText("selected class :");
                ta.append(s1);
        }
    }
    public static void main(String arg[])
    {
        new RadioDemo();
    }
}