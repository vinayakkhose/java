import java.util.*;
class firlassum
{

   public static void main(String []arg)
      {
           int n,s=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number :");
           n=sc.nextInt();
           int d=n%10;
           n=n/10;
        while(n>0)
         {
            d=n%10;
             s=s*10+d;
            n=n/10;
        }
          int d1=s%10;
      System.out.println("first digit="+d1);
      }
}