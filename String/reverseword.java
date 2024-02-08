import java.util.*;
class reverseword
{
    public static void main(String args[])
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String revString = "";
        String arr[] = s.split(" ");

        for(int i = 0;i<arr.length;i++)
        {
                    String rev = "";
            String word = arr[i];

            for(int j = word.length()-1;j>=0;j--)
            {
                rev = rev + word.charAt(j);
            }
            revString = revString + rev + " ";
        }
        System.out.println(revString +" ");
    }
}