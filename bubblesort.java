import java.util.*;
import java.util.Arrays;
class bubblesort{
    public static void main(String args[])
    {
        int arr[] = {4,2,7,8,6,3,5};
        int size = arr.length;
        int temp;
        for(int i = 0;i<size-1; i++)
        {
            for (int j = 0; j<size-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }   
    //    System.out.println(Array.toString(arr));
    for(int i =0;i<size-1;i++)
    {
        System.out.println(arr[i]);
    }
    }
}