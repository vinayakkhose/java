import java.util.*;
class CovideException extends Exception 
{
    public String toString()
    {
        return "patient is covide possitive need to hospitlized";
    }
}
class Patient
{
    String pname;
    int age,olevel,hrct;
    void accept()
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name age oxygen level HRCT report :");
        pname=sc.next();
        age=sc.nextInt();
        olevel=sc.nextInt();
        hrct=sc.nextInt();

        if(olevel<95 && hrct>10)
        throw new CovideException();
        disp();
        }catch(CovideException e)
        {
            System.out.println(e);
        }
    }
    void disp()
    {
       System.out.println("patient name :"+pname);
       System.out.println("patient age :"+age);
       System.out.println("patient oxygen level :"+olevel);
       System.out.println("patient HTCT score :"+hrct);
    }
    public static void main(String arg[])
    {
           Patient ob=new Patient();
           ob.accept();    
    }
}
