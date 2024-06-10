class md{
    public static void main(String arg[])
     {
        int n=1;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<i;j++)
            {
                   System.out.print(n++%2);
            }
            System.out.println();
        }
     }
}