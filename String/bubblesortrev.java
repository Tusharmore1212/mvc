class bubblesortrev
{
    public static void main(String args[])
    {
        int arr[]={3,6,2,7,1,8};
        int leng = arr.length;
        for(int i =0;i<leng;i++)
        {
            for(int j= 0;j<leng-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }

        for(int i =0;i<leng;i++){
            System.out.println(arr[i]);
        }
        
    }
}