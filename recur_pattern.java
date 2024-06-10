class demo
{
    static void print(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print("*");
        print(num-1);
    }
   static void patter(int n,int i)
    {
       if(n==0)
       return;
       print(i);
       System.out.println();
       patter(n-1,i+1);
    }
    public static void main(String arg[])
    {
        int n=4;
        patter(n,1);
    }
}