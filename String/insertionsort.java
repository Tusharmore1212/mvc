class insertionsort
{
    public static void main(String args[])
    {
        int temp,j;
        int arr[]={3,5,1,8,9,2};
        int leng = arr.length;
        for(int i = 1;i<leng;i++)
        {
            temp = arr[i];
            j =i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j= j-1;
            }

            arr[j]= temp;
        }

        for(int i = 0;i<leng;i++)
        {
            System.out.println(arr[i]);
        }
    }
}