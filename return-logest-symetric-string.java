import java.util.*;
class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.next();
        int n=s1.length();
        int left[]=new int[n-1];
        int right[]=new int[n-1];
        if(s1.charAt(0)=='<')
         left[0]=1;
        else
         left[0]=0;
        for(int i=1;i<n-1;i++)
        {
            if(s1.charAt(i)=='<')
             left[i]=left[i-1]+1;
            else
             left[i]=0;
        }
        if(s1.charAt(n-1)=='>')
         right[n-2]=1;
        else
         right[n-2]=0;
        for(int i=n-3;i>0;i--)
        {
            if(s1.charAt(i+1)=='>')
             right[i]=right[i+1]+1;
            else
             right[i]=0;
        }
        int min1;
        int min=0;
        for(int i=0;i<n-1;i++){
           min1=2*Math.min(left[i],right[i]);
           if(min1>0)
            min=min1;
        }
        System.out.println(min);
    }
}