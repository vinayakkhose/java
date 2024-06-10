import java.util.*;
class demo 
{
    String s1;
    Scanner sc=new Scanner(System.in);
    demo()
    {
       System.out.println("enter string :");
        s1=sc.nextLine();
        s1=s1+" ";
    }
    void cal()
    {
        String a[]=s1.split(" "),max=a[0];
        int n=a.length;
         for(int i=1;i<n;i++)
         {
                if(a[i].length()>max.length())
               {
                    max=a[i];
                }    
         }
        System.out.println("maximun wor="+max);
    }
    public static void main(String arg[])
    {
        demo ob=new demo();
        ob.cal();
    }
}