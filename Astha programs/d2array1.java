import java.util.*;
class d2array1
{
    public static void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        System.out.println("Enter "+r*c+" numbers");
        for (int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             a[i][j]=sc.nextInt();
             System.out.print(a[i][j]+" ");
         }
         System.out.println();
        }
        System.out.println("odd number in array are ");
        for (int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             if((a[i][j]%2)!=0)
             System.out.print(a[i][j]+" ");
             else
             continue;
         }
         
        }
    }
}