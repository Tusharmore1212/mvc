// Write a Java program to count the number of words in a string?
import java.util.*;
class program1
{
    public static void main(String args[])
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String arr[] = s.split(" ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

