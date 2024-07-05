import java.util.*;
class diagonal
{
    public static void main()
    {   Scanner sc =new Scanner(System.in);
        System.out.println("enter size");
        int N =sc.nextInt();
        int a[][]=new int[N][N];
        int ls=0;
        int rs=0;
        System.out.println("Enter the elements");
        for (int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                a[i][j]=sc.nextInt();
                System.out.print(a[i][j]+" ");
                if(i==j)
                {
                    ls=ls+a[i][j];
                }
                if(i+j==(N-1))
                rs=rs+a[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of left diagonal "+ls);
        System.out.println("Sum of right diagonal "+rs);
    }
}