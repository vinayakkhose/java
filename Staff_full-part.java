import java.util.*;
abstract class Staff
{
    
    String name,add;
    Staff(String name,String add)
    {
        this.name=name;
        this.add=add;
    }
    abstract void disp();
}
class Fulltime  extends Staff
{
String dept;
int sal;
Fulltime(String name,String add,String dept,int sal)
{
    super(name,add);
    this.dept=dept;
    this.sal=sal;
}
void disp()
{
    System.out.println("name :"+name);
    System.out.println("address :"+add);
    System.out.println("department :"+dept);
     System.out.println("salary :"+sal);
}
}
class Parttime  extends Staff
{
int h,r;
Parttime(String name,String add,int h,int r)
{
    super(name,add);
    this.h=h;
    this.r=r;
}
void disp()
{
    System.out.println("name :"+name);
    System.out.println("address :"+add);
    System.out.println("num of hourse :"+h);
    System.out.println("hourse per rate:"+r);
    System.out.println("salary :"+(h*r));
}
}
class MD
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,ch,sal,h,r;
        String name,add,dept;
        
        do{
            System.out.println("Enter limit :");
            n=sc.nextInt();
            System.out.println("-------------*-------------");
            System.out.println("1-full time  2-part time 3-Exit ");
            System.out.println("enter choice : ");
            ch=sc.nextInt();
            System.out.println("-------------*-------------");
            switch(ch)
            {
                case 1:     Fulltime ob[]=new Fulltime[n];
                           for(int i=0;i<n;i++)
                          { 
                            System.out.println("Enter name :");
                            name=sc.next();
                            System.out.println("Enter address :");
                            add=sc.next();
                            System.out.println("Enter departmanr :");
                            dept=sc.next();
                            System.out.println("Enter salary :");
                            sal=sc.nextInt();
                              ob[i]=new Fulltime(name,add,dept,sal);
                          }
                          for(int i=0;i<n;i++)
                          {
                            ob[i].disp(); 
                          }
                          break;

                
                case 2:   Parttime ob1[]=new Parttime[n];
                          for(int i=0;i<n;i++)
                         { 
                           System.out.println("Enter name :");
                           name=sc.next();
                           System.out.println("Enter address :");
                           add=sc.next();
                           System.out.println("Enter num of hourse work :");
                           h=sc.nextInt();
                           System.out.println("Enter hource per rate :");
                           r=sc.nextInt();
                             ob1[i]=new Parttime(name,add,h,r);
                         }
                         for(int i=0;i<n;i++)
                          {
                            ob1[i].disp(); 
                          }
            }
        }while(ch!=3);
    }
}
