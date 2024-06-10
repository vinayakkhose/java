import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calcudemo extends Frame implements ActionListener
{
    float a,b,c;
    int ch;
    TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,bcl;
    Panel p1;
    Calcudemo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(2,1));
        t1=new TextField(10);
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        bdot=new Button(".");
        badd=new Button("+");
        bsub=new Button("-");
        bmul=new Button("*");
        bdiv=new Button("/");
        beq=new Button("=");
        bcl=new Button("cl");
        b0=new Button("0");
        p1=new Panel();
        p1.setLayout(new GridLayout(5,3));
         add(t1);
         p1.add(b1);
         p1.add(b2);
         p1.add(b3);
         p1.add(b4);
         p1.add(b5);
         p1.add(b6);
         p1.add(b7);
         p1.add(b8);
         p1.add(b9);
         p1.add(b0);
         p1.add(bdot);
         p1.add(badd);
         p1.add(bsub);
         p1.add(bmul);
         p1.add(bdiv);
         p1.add(beq);
         p1.add(bcl);
         add(p1);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b0.addActionListener(this);
         bdot.addActionListener(this);
         badd.addActionListener(this);
         bsub.addActionListener(this);
         bmul.addActionListener(this);
         bdiv.addActionListener(this);
         beq.addActionListener(this);
         bcl.addActionListener(this);
         
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
          t1.setText(t1.getText()+""+b1.getLabel());
        }
        if(ae.getSource()==b2)
        {
          t1.setText(t1.getText()+""+b2.getLabel());
        }
        if(ae.getSource()==b3)
        {
          t1.setText(t1.getText()+""+b3.getLabel());
        }
        if(ae.getSource()==b4)
        {
          t1.setText(t1.getText()+""+b4.getLabel());
        }
        if(ae.getSource()==b5)
        {
          t1.setText(t1.getText()+""+b5.getLabel());
        }
        if(ae.getSource()==b6)
        {
          t1.setText(t1.getText()+""+b6.getLabel());
        }
        if(ae.getSource()==b7)
        {
          t1.setText(t1.getText()+""+b7.getLabel());
        }
        if(ae.getSource()==b8)
        {
          t1.setText(t1.getText()+""+b8.getLabel());
        }
        if(ae.getSource()==b9)
        {
          t1.setText(t1.getText()+""+b9.getLabel());
        }
        if(ae.getSource()==b0)
        {
          t1.setText(t1.getText()+""+b0.getLabel());
        }
        if(ae.getSource()==bdot)
        {
          t1.setText(t1.getText()+".");
        }

        if(ae.getSource()==badd)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
             ch=1;
        }
        if(ae.getSource()==bsub)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
             ch=2;
        }
        if(ae.getSource()==bmul)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
             ch=3;
        }
        if(ae.getSource()==bdiv)
        {
            a=Float.parseFloat(t1.getText());
            t1.setText("");
             ch=4;
        }
        if(ae.getSource()==beq)
        {
            b=Float.parseFloat(t1.getText());
            switch(ch)
            {
                case 1:c=a+b;break;
                case 2:c=a-b;break;
                case 3:c=a*b;break;
                case 4:c=a/b;break;
            }
            t1.setText(""+c);
        }
         if(ae.getSource()==bcl)
        {
            t1.setText("");
        }

         
    }
    public static void main(String arg[])
    {
        new Calcudemo();
    }
} 