import java.util.*;
class pallindrome{
    public static void main(String args[])
    {
        int i,rem=0,temp,sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        temp = number;
        while(number>0)
        {
            rem = number%10;
            sum = (sum*10)+rem;
            number = number/10;
        }
        if(sum == temp)
        {
            System.out.println(sum);
            System.out.println("pallindrome");
        }
        else 
        {
             System.out.println(sum);

            System.out.println("not pallindrome");
        }
    
    }
}