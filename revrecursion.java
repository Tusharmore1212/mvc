// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class revrecursion
 {
    String revstring="";
    public String reverse(String b, int i)
    {
        if(i<0)
        {
            return revstring;
        }
        revstring= revstring+b.charAt(i);
        i--;
        return reverse(b,i);
    }
    public static void main(String[] args) 
    {
        revrecursion h = new revrecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String a = sc.nextLine();
        int i = a.length()-1;
        System.out.println(i);
        String k =h.reverse(a,i);
        System.out.println(k);
    }
}