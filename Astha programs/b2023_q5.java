import java.util.*;
class b2023_q5
{
    void print()
    {
        for(int i =1;i<=5;i++)
        {
            for(int j = 1;j<=4;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    void print(int n)
    {
        int e=0;
        int o=0;
        int d;
        while(n>0)
        {
         d=n%10;  
         if(d%2==0)
         e=e+d;
         else
         o=o+d;
         n=n/10;
        }
        if(o==e)
        System.out.println("Lead number");
        else
        System.out.println("NOT a lead number");
    }
    public static void main()
    {    b2023_q5 ob = new b2023_q5();
        ob.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int c= sc.nextInt();
        
        ob.print(c);
        
    }
    
        
}
