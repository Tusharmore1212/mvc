import java.util.*;
class Stringpallindrome{
    public static void main(String args[])
    {
        int i;
        String revstring="";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
       
        for(i = str.length()-1;i>=0;i--)
        {
            revstring= revstring+str.charAt(i);
        }
        System.out.println(revstring);
    //     if(str.equals(revstring))
    //     {
    //         System.out.println("pallindrome");
    //     }
    //     else
    //     {
    //         System.out.println("not pallindrome");
    //     }
    
     }
}