import tybbaca.*;
import java.util.*;
class MD
{
     public static void main(String arg[])
     {
        int n,no;
        String tname,sname,sub;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit :");
        n=sc.nextInt();
        Student ob[]=new Student[n];
         Teacher1 ob1[]=new Teacher1[n];
          System.out.println("enter"+n+" student deatils");
         for(int i=0;i<n;i++)
         {
           System.out.println("enter rno");
           no=sc.nextInt();
           System.out.println("enter name :");
           sname=sc.next();
            System.out.println("enter per :");
           per=sc.nextFloat();
           ob[i]=new Student(no,sname,per);
         }
         System.out.println("enter"+n+" teacher deatils");
         for(int i=0;i<n;i++)
         {
           System.out.println("enter tno :");
           no=sc.nextInt();
           System.out.println("enter  tname :");
           tname=sc.next();
           System.out.println("enter subject name :");
           sub=sc.next();
           ob1[i]=new Teacher1(no,tname,sub);
         }
         System.out.println("student info");
         for(int i=0;i<n;i++)
         {
            ob[i].disp();
         }
         System.out.println("Teacher info");
         for(int i=0;i<n;i++)
         {
            ob1[i].disp();
         }
     }
} 
