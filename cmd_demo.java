class arg_sort {
    public static void main(String[] args) {
        int temp;
        int n=args.length;
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(args[i]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if(a[j]>a[j+1])
                 {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}