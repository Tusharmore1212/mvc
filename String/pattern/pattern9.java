class pattern9
{
    public static void main(String args[])
    {
        int i,j,n=6;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i+1;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
           
            System.out.println();
        }
    }
}