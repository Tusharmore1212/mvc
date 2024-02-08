class pattern7
{
    public static void main(String args[])
    {
        int i,j,n=6;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<(n+1)-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>0;k--)
            {
                System.out.print(k);
            }
             for(int k=2;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}