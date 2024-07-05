import java.util.*;
class d2array
{
    public static void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        System.out.println("Enter "+r*c+" numbers");
        int s=0;
        for (int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             a[i][j]=sc.nextInt();
         }
        }
        for (int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             System.out.print(a[i][j]+" ");
         }
         System.out.println();
        }
        for (int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
             if(i==0||i==(r-1)||j==0||j==(c-1))
             {
                 System.out.print(a[i][j]+" ");
                 s=s+a[i][j];
             }
             else
             System.out.print("  ");
         }
         System.out.println();
        }
        System.out.println("The sum is "+s);
    }
}