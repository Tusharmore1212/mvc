class pattern8
{
    public static void main(String args[])
    {
        int i,j,n=6;
        for(i=0;i<=n;i++)
        {
            for(j=1;j<(n+1)-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
           
            System.out.println();
        }
        for(i=n;i>0;i--)
        {
            for(j=1;j<(n+1)-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
           
            System.out.println();
        }
        
    }
}