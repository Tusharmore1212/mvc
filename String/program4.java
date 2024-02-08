import java.util.*;
class program4
{
    public static void main(String args[])
    {
        String a = "rajaram";
        String b = "ramrajda";

        char p[] = a.toLowerCase().toCharArray();
        char q[] = b.toLowerCase().toCharArray();

        Arrays.sort(p);
        Arrays.sort(q);

        if(Arrays.equals(p,q))
        {
            System.out.println("matches");
        }
        else
        {
            System.out.println("not matches");
        }
    }
}