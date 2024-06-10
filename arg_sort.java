class arg_sort
{
   public static void main(String arg[])
  {
      int n=arg.length;
       int i,d,s,num,j=0;
          int arm[]=new int[n],a[]=new int[n];
       for(i=0;i<n;i++)
       {
           a[i]=Integer.parseInt(arg[i]);
        }
        for(i=0;i<n;i++)
         {
              s=0;
              num=a[i];
               while(num>0)
                {
                    d=num%10;
                     s=s+d*d*d;
                     num=num/10;
                 }
          if(s==a[i])
             arm[j++]=s;
        }
         System.out.println("value of j :"+j);
  for(i=0;i<j;i++)
      {
             System.out.println(arm[i]);
     }
  }

}