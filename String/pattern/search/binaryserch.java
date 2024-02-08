class binaryserch
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        int leng= arr.length;
        int li =0;
        int hi=leng-1;
        int mid = (li+hi)/2;
        int item =8;
        while(li<=hi)
        {
            if(arr[mid]==item)
            {
                System.out.println("element found at index"+mid);
                break;
            }
            else if(arr[mid]<item)
            {
                li=mid+1;
            }
            else
            {
                hi=mid-1;
            }
            mid = (li+hi)/2;
        }
        if(li>hi)
        {
            System.out.println("element not found");
        }
    }
}