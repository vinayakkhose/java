import java.util.*;
class Ex3
{
    public static void main(String[] arg)
    {
        try {
            int a[]=new int[-5];
            a[0]=5;
            System.out.println(a[0]);

        } catch (Exception e) {
           System.out.println("error ="+e);
        }
    }
}