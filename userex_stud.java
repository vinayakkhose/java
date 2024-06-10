import java.util.*;
class InvalidDataException extends Exception
{
    public String toString()
    {
        return "Invalid data entry...";
    }
}
class demo
{
    public static void  main(String []arg)
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name :");
        String name=sc.nextLine();
        System.out.println("Enter age :");
        int age=sc.nextInt();
        System.out.println("Enter yaer :");
        String y=sc.next();
                    if(age<10 || age >=25)
                    throw new InvalidDataException();
                    if(!(y=="FY" || y=="TY"|| y=="SY"))
                    {
                       throw new InvalidDataException();
                    }
                    System.out.println("name :"+name);
                    System.out.println("age :"+age);
                    System.out.println("year :"+y);
        }catch(Exception e)
        {
            System.out.println(e);
        }
                    
        
    }
}