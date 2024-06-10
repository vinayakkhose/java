import java.util.*;
class emp
{
    int eno;
    float esal;
    String ename;
void accept()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter emp no");
     eno=sc.nextInt();
     System.out.println("enter emp name");
     ename=sc.next();
     System.out.println("enter emp no");
     esal=sc.nextFloat();
}
void display()
{
  System.out.println("enter emp no"+eno);
  System.out.println("enter emp name"+ename);
  System.out.println("enter emp sal"+esal);
}
public static void main(String ary[])
{
    int l;
    System.out.println("enter limit");
    Scanner sc=new Scanner(System.in);
    l=sc.nextInt();
    emp ob[]=new emp[l];
for( int i=0;i<l; i++)
{
    ob[i]=new emp();
    ob[i].accept();
}
for( int i=0;i<=l; i++)
{
    ob[i].display();
}
}
}