import java.util.*;
class LessnumExc extends Exception
{
public String toString()
  {
     return "less nunumber";
  }
}
class GreternumExc extends Exception
{
    public String toString()
      {
         return "greater nunumber";
      }
}
class demo
{
    static void factorial(int a)
    {
        int s=1;
         for(int i=a;i>0;i--)
        {
          s=s*i;
        }
         System.out.println("factorial="+s);
    }
    public static void main(String[] arg)
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int a=sc.nextInt();
        if(a<5)
        throw new LessnumExc();
        if(a>10)
        throw new GreternumExc();
        factorial(a);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
