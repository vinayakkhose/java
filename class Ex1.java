class Ex1
{
    public static void main(String[] arg)
    {
        try {
            int a[]=new int[-5];

        } catch (Exception e) {
           System.out.println("error ="+e);
        }
    }
}