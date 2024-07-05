import java. util.*;
class pqr
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of terms");
        int n=sc.nextInt();
        int count=0;
        int i=1;
        for( i=1;i<=n;i++)
        {
            int x=(int)Math.pow(i,i)/i;
            count=count+x;
        }
        System.out.println("THE SUM IS "+count);
        
        
    }
}

