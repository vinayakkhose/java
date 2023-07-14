import java.util.*;
class InvalidDataException extends Exception
{
    public String toString()
    {
        return "Invalid data Entry....";
    }
} 
class Demo
{
   public static void main(String arg[])
   {
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter pan number :");
      String s1=sc.next();
   if(s1.length()!=10)
   throw new InvalidDataException();
      for(int i=0;i<4;i++)
      {
           if(!Character.isUpperCase(s1.charAt(i)))
             throw new InvalidDataException();
      }
      for(int i=5;i<8;i++)
      {
        if(!Character.isDigit(s1.charAt(i)))
        throw new InvalidDataException();
      }
      if(!Character.isUpperCase(s1.charAt(9)))
      throw new InvalidDataException();
      System.out.println("pan number="+s1);
    }catch(Exception e)
    {
        System.out.println(e);
    }
   }
}