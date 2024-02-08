class pattern6
{
    public static void main(String args[])
    {
        int i,j=1,n=6;
        for(i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                if((i+k)%2==0)
                {
                    System.out.print("1"+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}