import java.awt.*;
import java.awt.event.*;
class StudInf extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField  t1;
    TextArea ta1,ta2;
    Button b1,b2;
    Checkbox c1,c2,c3,c4,c5,ge1,ge2;
    CheckboxGroup ch1;
    StudInf()
    {
        setVisible(true);
         setSize(400,600);
         setLayout(new FlowLayout());
         l1=new Label("Eneter name :");
         l2=new Label("Enter Address :");
         l3=new Label("Select Gender :");
         l4=new Label("select Subject :");
         t1=new TextField(20);
         ta1=new TextArea(4,17);
         ta2=new TextArea(10,25);
         ch1=new CheckboxGroup();
         ge1=new Checkbox("male",ch1,false);
         ge2=new Checkbox("female",ch1,false);
         c1=new Checkbox("java");
         c2=new Checkbox("python");
         c3=new Checkbox("ops");
         c4=new Checkbox("software enginering");
         c5=new Checkbox("php");
         b1=new Button("ok");
         b2=new Button("Clear");
         add(l1);add(t1);add(l2);add(ta1);add(l3);add(ge1);add(ge2);add(l4);add(c1);add(c2);add(c3);add(c4);add(c5);add(ta2);add(b1);add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
         
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String n=t1.getText();
            String add=ta1.getText();
            String g="",s="";
            if(ge1.getState()==true)
               g="male";
            if(ge2.getState()==true)
               g="female";
            if(c1.getState()==true)
               s="java";
            if(c2.getState()==true)
               s=" ,python";
            if(c3.getState()==true)
               s=",ops";
            if(c4.getState()==true)
               s=",software enginering";
            if(c5.getState()==true)
               s=", php";
            
        
            ta2.append("name :"+n);
            ta2.append("\n address :"+add);
            ta2.append("\n gender :"+g);
            ta2.append("\n subjects :"+s);  
        }
        if(ae.getSource()==b2)
        {
            t1.setText("");
            ta1.setText("");
            ge1.setState(false);
            ge2.setState(false);
            c1.setState(false);
            c2.setState(false);
            c3.setState(false);
            c4.setState(false);
            c5.setState(false);  
            ta2.setText(""); 
        }
    }
    public static void main(String arg[])
    {
        new StudInf();
    }
}