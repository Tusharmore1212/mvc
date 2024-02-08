class pattern5
{
    public static void main(String args[])
    {
        int i,j=1,n=6;
        for(i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}