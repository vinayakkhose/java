import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame implements ActionListener
{
    Float a,b,c;
    int ch;
   Label l1;
    TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bmult,bdiv,bsub,bequal,bcle;
    FrameDemo()
    {
        setVisible(true);
        setSize(144,229);
        setLocation(120,400);
        setLayout(new FlowLayout());
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
          b0=new Button("0");
         bdot=new Button(".");
         badd=new Button("+");
         bsub=new Button("-");
         bmult=new Button("*");
         bdiv=new Button("/"); 
         bequal=new Button("=");
         bcle=new Button("ce");
         l1=new Label(" ");
         add(l1);add(t1);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b0);add(bdot);add(badd);add(bsub);add(bmult);add(bdiv); add(bequal);add(bcle);
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
         bdiv.addActionListener(this);
         bmult.addActionListener(this);
         bequal.addActionListener(this);
         bcle.addActionListener(this);
               
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
                if(l1.getText()==" ")
                   l1.setText(""+a);
                else
                l1.setText(""+l1.getText()+"+"+a);
                  t1.setText("");
                  ch=1;  
            }
              if(ae.getSource()==bsub)
            {
                a=Float.parseFloat(t1.getText());
                l1.setText(""+l1.getText()+"-"+a);
                if(l1.getText()==" ")
                   l1.setText(""+a);
                else
                  t1.setText("");
                  ch=2;  
            }
              if(ae.getSource()==bmult)
            {
                a=Float.parseFloat(t1.getText());
                if(l1.getText()==" ")
                   l1.setText(""+a);
                else
                l1.setText(""+l1.getText()+"*"+a);
                  t1.setText("");
                  ch=3;  
            }
             if(ae.getSource()==bdiv)
            {
                a=Float.parseFloat(t1.getText());
                if(l1.getText()==" ")
                   l1.setText(""+a);
                else
                l1.setText(""+l1.getText()+"/"+a);
                  t1.setText("");
                  ch=4;  
            }
            if(ae.getSource()==bequal)
            {
                b=Float.parseFloat((t1.getText()));
                switch(ch)
                {
                    case 1: c=a+b;
                           break;
                    case 2: c=a-b;
                           break;
                    case 3: c=a*b;
                           break;
                    case 4: c=a/b;                           
                }
                t1.setText(""+c);
                l1.setText(""+c);
            }
            if(ae.getSource()==bcle)
            {
                t1.setText("");
                l1.setText("");
            }

    }
    public static void main(String arg[])
    {
        FrameDemo ob=new FrameDemo();
    }
}