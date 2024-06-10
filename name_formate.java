import java.util.*;
class name
{
    public static void main(String arg[])
    {
    System.out.println("Enter name  :");
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
     String s2[]=s1.split(" ");
     System.out.println("name =");
     System.out.println(s2[2]+" "+s2[0].charAt(0)+"."+s2[1].charAt(0)+".");
    }
}