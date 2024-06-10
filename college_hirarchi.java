   import java.util.*;
class College{
    String cname,add,phone;
    Scanner sc=new Scanner(System.in);
    College()
    {
      System.out.println("enter college name :");
      cname=sc.next();
      System.out.println("enter college address :");
      cname=sc.next();
      System.out.println("enter college phone number :");
      cname=sc.next();
    }
}
class Teacher extends College
{
     String tname,quli;
     int tid;
     Teacher()
     {
        System.out.println("Enter teacher id :");
        tid=sc.nextInt();
        System.out.println("Enter teacher name :");
        tname=sc.next();
        System.out.println("Enter teacher qulification :");
        quli=sc.next();   
     }
     void disp_t()
     {
        System.out.println("teacher id:"+tid);
        System.out.println("teacher name :"+tname);
        System.out.println("teacher qulification :"+quli);
     }
}
class Student extends College
{
     String sname;
     int rno;
     float per;
     Student()
     {
        System.out.println("Enter student roll no :");
        rno=sc.nextInt();
        System.out.println("Enter student name :");
        sname=sc.next();
        System.out.println("Enter student percentage :");
        per=sc.nextFloat();   
     }
     void disp_s()
     {
        System.out.println("student roll no :"+rno);
        System.out.println("student name :"+sname);
        System.out.println("student percentage :"+per);
     }
     public static void main(String[] arg)
     {
        Teacher ob=new Teacher(); 
        Student ob1=new Student();
        ob.disp_t();
        ob1.disp_s();
     }
}

