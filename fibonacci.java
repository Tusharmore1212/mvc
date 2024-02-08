import java.util.*;
class fibonacci{
    public static void main(String args[])
    {
        int i, n1=0, n2=1, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        for(i=1;i<=number;i++)
        {
            System.out.println(n1);
            temp = n1+n2;
            n1= n2;
            n2=temp;
        }
    }
}