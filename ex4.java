import java.util.*;
class Ex4
{
    public static void main(String[] arg)
    {
        try {
            int n=5;
            int a,b,c,d;
            a=n+8;
            b=n-3;
            c=n/0;
            d=n*5;
            System.out.println("addition ="+a);
            System.out.println("sub ="+b);
            System.out.println("devision ="+c);
            System.out.println("multi ="+d);
        } catch (Exception e) {
           System.out.println("error ="+e);
        }
    }
}