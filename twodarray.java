import java.util.*;
class twodarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int row = sc.nextInt();
        System.out.println("enter no of column");
        int col =sc.nextInt();  
        int sum=0;
        int arr[][] = new int[row][col];

        for(int i =0;i<row;i++)
        {
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("...............");

        for(int i = 0;i<row;i++)
        {
            sum=0;
            for(int j = 0;j<col;j++)
            {
            sum = sum + arr[i][j];  
            }
            System.out.print(sum + " ");
            System.out.println();
        }
    }
}