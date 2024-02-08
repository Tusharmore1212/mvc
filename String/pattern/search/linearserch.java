import java.util.*;
class linearserch
{
    public static void main(String args[])
    {
        int arr[] = {3,6,1,7,9,7,2};
        int leng = arr.length;
        int c=0;
        System.out.println("enter element to searh");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0;i<leng;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("element found on"+i);
                c++;
            }
        }
        if(c==0)
        {
        System.out.println("element not found ");

        }
    }
}