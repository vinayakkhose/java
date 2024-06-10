import java.util.*;
class email
{
    public static void main(String arg[])
    {
    System.out.println("Enter email  :");
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    int f=0;
    String s2[]=s1.split(" ");
    if(Character.isLetter(s1.charAt(0))) 
    {
      f=1;
    }
     for(int i=0;i<s1.length();i++)
     {
        if((s1.charAt(i)=='@'))
           {
            f=1;
           }
     }
 
  if(f==1)
     System.out.println("valid email...");
     else
     System.out.println("invalid email...");
    
    }
}