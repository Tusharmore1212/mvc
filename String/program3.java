import java.util.*;
class program3
{
    public static void main(String args[])
    {
        System.out.println("enter String");
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        int count=0;
        s = s.replace(" ","");
        for(int i = 0;i<s.length();i++)
        {
            for(int j = 0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            
            if(count >1)
            
            {
                System.out.println("duplicate character "+s.charAt(i)+": "+count);
            }
           count=0; 
        }
    }
}