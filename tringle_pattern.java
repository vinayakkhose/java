import java.util.*;
class patter
{
  public static void main(String arg[])
   {
       int n;
          Scanner sc=new Scanner(System.in);
         System.out.println("ente limit :");
         n=sc.nextInt();
             for(int i=0;i<n;i++)
                 {
                         for(int j=0;j<n; j++)
                           {
                              if(j==0 || i==0||i==n-1)
                                 System.out.print("* ");
                                else if(j!=n-1)
                                       System.out.print(" ");
                                  else if(j==n-1)
                                   System.out.print("  *");
                          }
                      System.out.println();
                   

                }
   }
}