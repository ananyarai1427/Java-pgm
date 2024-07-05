import java.util.*;
class d2
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.of rows and column respectively");
        int r=sc.nextInt();
        int c=sc.nextInt();
        if(c==r)
        {
        int a[][]=new int[r][c];
        System.out.print("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int j =0;
        System.out.println("Right Diagonal is:");
        for(int i=r-1;i>=0;i--)
        {
            System.out.print(a[j][i]+" ");
            j++;
        }
        System.out.println("\nLeft Diagonal is:");
        for(int i=0;i<r;i++)
         System.out.print(a[i][i]+" ");
        }
        else
        System.out.print("Kr diye bakloliyatttt");
    }
}