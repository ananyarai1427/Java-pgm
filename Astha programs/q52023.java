import java.util.*;
class q52023
{
    void print()
    { int a=1;
        for(int i =1;i<=5;i++)
        {
            for (int j=1;j<=4;j++)
            {
                System.out.print(a+" ");
                
            }
            a++;
            System.out.println();
        }
    }
    void print(int n)
    {
        int e=0,o=0;
        while(n>0)
        {
            int d=n%10;
            if(d%2==0)
            e=e+d; 
            else
            o=o+d;
            n=n/10;
        }
        if(o==e)
        System.out.println("Lead number");
        else
        System.out.println("Not a lead number");
    }
    public static void main()
    {   
            q52023 obj=new q52023();
        obj.print();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int p=sc.nextInt();
    
        obj.print(p);
    }
}