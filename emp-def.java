import java.util.*;
class emp
{
     int eno,sal;
       String name;
        emp()
        {
           Scanner sc=new Scanner(System.in);
             System.out.println("enter emp id :");
              eno=sc.nextInt();
            System.out.println("enter emp name :");
           name=sc.next();
                System.out.println("enter salary :");
               sal=sc.nextInt();
         }
  void disp()
   {
       System.out.println("employee id ="+eno);
       System.out.println("employee name ="+name);
       System.out.println("employee salary ="+sal);
   }
}
class MD
{
public static void main(String[] arg)
{
      emp ob=new emp();
ob.disp();
}
}