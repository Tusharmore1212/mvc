class selectioinsortrev
{
    public static void main(String args[])
    {
        int arr[] = {3,6,2,8,1,5,9};
        int leng = arr.length;
        for(int i =0;i<leng;i++)
        {
            int min = i;
            for(int j= i+1;j<leng;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i =0;i<leng;i++)
        {
            System.out.println(arr[i]);
        }
    }
}