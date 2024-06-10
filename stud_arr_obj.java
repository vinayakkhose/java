import java.util.*;
class Student
{
   int rno;
   float per;
   String name;
   Student(int rno,String name,float per)
   {
     this.rno=rno;
     this.name=name;
     this.per=per; 
   }
   void disp()
   {
    System.out.println("student roll no :"+rno);
    System.out.println("student name :"+name);
    System.out.println("student percentege :"+per);
   }
    static void sort(Student ob[],int n)
   {
    Student t;
    for(int pass=0;pass<n;pass++)
    {
        for(int i=0;i<n-pass;i++)
        {
            if(ob[i].per>ob[i+1].per)
            {
              t=ob[i];
              ob[i]=ob[i+1];
              ob[i+1]=t; 
            }
        }
    }
    System.out.println("\n\nsorting student information :");
         for(int i=0;i<n;i++)
          {
            ob[i].disp();
          }
    }   
   }

class md 
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("etner limit :");
        n=sc.nextInt();
        Student ob[]=new Student[n];
        for(int i=0;i<n;i++)
          {
            System.out.println("enter roll no :");
            int rno=sc.nextInt();
            System.out.println("enter name of student :");
            String name=sc.next();
            System.out.println("enter percentage :");
            float per=sc.nextFloat();
            ob[i]=new Student(rno,name,per);
          }
          for(int i=0;i<n;i++)
          {
            ob[i].disp();
          }
          ob[0].sort(ob,n); 
    }
}