import java.util.*;
class demo
{
    static int cnt=0;
    int id;
    String name;
    demo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID");
        id=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        cnt++;
    }
    public String toString()
    {
        return id+"\t"+name;
    }
    public static void main(String arg[])
    {
        demo ob[]=new demo[5];
        for(int i=0;i<4;i++)
        {
            ob[i]=new demo();  
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(ob[i].toString());
        }
        System.out.println("objet count :"+cnt);
    }
}