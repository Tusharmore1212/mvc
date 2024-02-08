class pattern4
{
    public static void main(String args[])
    {
        int i,j,n=6;
        for(i=0;i<n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}