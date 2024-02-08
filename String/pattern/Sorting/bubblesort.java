class bubblesort{
    public static void main(String args[])
    {
        int a[] ={6,3,9,8,2,5,10,4};
        int size = a.length;
        for (int i =0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=0;i<size;i++)
        {
            for(int j = 0;j<size-1;j++)
            {
                if(a[j]>a[j+1])
                {
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
                

            }
        }
        System.out.println("after");
        for (int i =0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}