import java.util.*;
class min
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int min1,min2,i,n;
System.out.println("enter limit :");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
  { 
   a[i]=sc.nextInt();
  }
min1=min2=Integer.MAX_VALUE;
for (i = 0; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }
        }
System.out.println("first min:"+min1);
System.out.println("2nd min:"+min2);
}
}