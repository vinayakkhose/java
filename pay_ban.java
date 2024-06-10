import java.util.*;
abstract class staff
{
    String name,add;
   staff(String name,String add)
   {
this.name=name;
this.add=add;
   }
   abstract void disp();
}
class fulltime extends staff
{
    int sal;
    String dep;
     fulltime(String name,String add,String dep,int sal)
     {
        super(name,add);
        this.dep=dep;
        this.sal=sal;
     }
     void disp()
     {
        System.out.println("name="+name);
        System.out.println("address="+add);
        System.out.println("department="+dep);
        System.out.println("salary="+sal);
     }
}

class parttime extends staff
{
        int hource,rate;
     parttime(String name,String add,int hource,int rate)
     {
        super(name,add);
        this.hource=hource;
        this.rate=rate;
     }
     void disp()
     {
        System.out.println("name="+name);
        System.out.println("address="+add);
        System.out.println("no of hource="+hource);
        System.out.println("rate="+rate);
        System.out.println("salary="+(hource*rate));
     }
}
class md1
{
    public static void main(String[] agr)
    {
      int ch,i,n;
      Scanner sc=new Scanner(System.in);
      fulltime ob[]=new fulltime[10];
      parttime ob1[]=new parttime[10];
      do{
        System.out.println("1- fulltime \n 2- parttime");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("enter limit=");
                     n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        System.out.print("enter name=");
                        String name=sc.next();
                        System.out.print("address=");
                        String add=sc.next();
                        System.out.print("department=");
                        String dep=sc.next();
                        System.out.print("salary=");
                        int sal=sc.nextInt();
                        ob[i]=new fulltime(name,add,dep,sal);
                    }
                    for(i=0;i<n;i++)
                    {
                        ob[i].disp();
                    }
                    break;
          case 2: System.out.println("enter limit=");
                     n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        System.out.print("enter name=");
                        String name=sc.next();
                        System.out.print("address=");
                        String add=sc.next();
                        System.out.print("hource=");
                        int hource=sc.nextInt();
                        System.out.print("worked rate=");
                        int rate=sc.nextInt();
                        ob1[i]=new parttime(name,add,hource,rate);
                    }
                    for(i=0;i<n;i++)
                    {
                        ob1[i].disp();
                    }
                break;
        }
      } while(ch<3);
    }
}