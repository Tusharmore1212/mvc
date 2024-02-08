import java.util.*;
class factorial{
    public static void main(String args[])
    {
        int i, fact=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        for(i=1;i<=number;i++)
        {
            fact = fact *i;
        }
        
        System.out.println(fact);
    
    }
}