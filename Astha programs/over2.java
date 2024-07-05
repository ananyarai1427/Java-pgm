import java.util.*;
class over2
{
    void polygon(int n,char ch)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
        {
            System.out.print(ch);
        }
        }
        System.out.println();
    }
    void polygon(int x, int y)
    {
        for(int i =0;i<x;i++)
        {
            for(int j = 0;j<y;j++)
            System.out.print("@");
        }
        System.out.println();
    }
    void polygon()
    {
        for(int i =1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("first ke liye");
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        over2 ob=new over2();
        ob.polygon(n,ch);
        System.out.println("second ke liye");
        int x=sc.nextInt();
        int y=sc.nextInt();
        ob.polygon(x,y);
        ob.polygon();
    }
}