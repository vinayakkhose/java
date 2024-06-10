import java.util.*;
class InvalidExc extends Exception
{
   public String toString()
   {
      return "invalid pan number...";
   }
}
class demo
{
   public static void main(String arg[])
   {
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter pan number...");
      String s1=sc.next();
      if(s1.length()!=10)
      {
        throw new InvalidExc();
      }
      for(int i=0;i<=4;i++)
      {
        if(!Character.isUpperCase(s1.charAt(i)))
        throw new InvalidExc();
      }
      for(int i=5;i<=8;i++)
      {
        if(!Character.isDigit(s1.charAt(i)))
        throw new InvalidExc();
      }
      if(!Character.isUpperCase(s1.charAt(9)))
      throw new InvalidExc();
      System.out.println("pan ="+s1);
      }catch(Exception e)
      {
        System.out.println(e);
      }
   }
}