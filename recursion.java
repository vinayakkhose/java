import java.util.*;
class demo
{
    int s=0;
     int sum(int sum,int n)
    {
      if(n==0)
          return s;

       return  sum(s+=n%10,n/10);
    }
    public static void main(String arg[])
    {
        demo ob=new demo();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number  :");
      int n=sc.nextInt();
      int s= ob.sum(0,n);
       System.out.println("sum of num  :"+s);
    }

}