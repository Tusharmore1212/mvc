class stringsort
{
    public static void main(String args[])
    {
        String arr[]={"adsa","ram","keshav","tushar","ankit"};
        int leng = arr.length;
        for(int i = 0;i<leng;i++)
        {
            for(int j= 0;j<leng-1;j++)
            {

                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<leng;i++)
        {
            System.out.println(arr[i]);
        }
    }
}