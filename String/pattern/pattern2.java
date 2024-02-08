class pattern2
{
    public static void main(String args[])
    {
        int i,j,n=6;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}