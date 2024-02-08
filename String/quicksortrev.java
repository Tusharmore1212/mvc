class quicksortrev
{
    public static void main(String args[])
    {
        int arr[] = {3,6,8,1,2,9,5};
        int leng= arr.length;
        quicksortrev rev = new quicksortrev();
        rev.quicksortrecorstion(arr,0,leng-1);
        for(int i =0;i<leng;i++)
        {
            System.out.println(arr[i]);
        }
    }

    int partition(int arr[],int low ,int high)
    {
        int pivot = arr[(low+high)/2];
        while(low<=high)
        {
             while(arr[low]<pivot)
             {
                low++;
             }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp = arr[low];
                arr[low]= arr[high];
                arr[high]=temp;

                low++;
                high--;
            }  
        }
        
         return low;
    }


    void quicksortrecorstion(int arr[],int low , int high)
    {
        int pi = partition(arr,low,high);
        if(low<pi-1)
        {
            quicksortrecorstion(arr,low,pi-1);
        }
        if(pi<high)
        {
            quicksortrecorstion(arr,pi,high);
        }
    }
}