import java.util.*;
class program2
{
    public static void main(String args[])
    {
        System.out.println("enter String");
        Scanner sc = new Scanner(System.in);

        String  s  = sc.nextLine();
        int count=0;
        char c = 'u';

        for(int i = 0;i<s.length();i++)
        {
            
            if(s.charAt(i)==c || s.toLowerCase().charAt(i)==c)
            {
                count++;
            System.out.println("0");

            }
            else
            {
                System.out.println("1");
            }
        }
        System.out.println("occurance of a="+" "+count);
    }
}