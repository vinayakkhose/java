import java.util.*;
class InvalidDateexception extends Exception
{
    public String toString()
    {
        return "invalid date";
    }
}
class demo
{
    public static void main(String arg[])
    {
        try{
        int dd,mm,yy;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter date month year :");
        dd=sc.nextInt();
        mm=sc.nextInt();
        yy=sc.nextInt();
          if(dd==0 || mm==0 || yy==0)
            throw new InvalidDateexception();
        if(mm>12)
        throw new InvalidDateexception();

        if(!(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12) && dd>31 )
        throw new InvalidDateexception();

        if(!(mm==2 || mm==4 || mm==6 || mm==9|| mm==11)&& dd>30)
        throw new InvalidDateexception();

        if(yy%4==0 && dd==28)
        throw new InvalidDateexception();
                System.out.println("date ="+dd+"/"+mm+"/"+yy);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}