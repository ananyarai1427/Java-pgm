import java.util.*;
class Narcissistic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int l=0,m=n,a=0;
        while(m>0)
        {
            m=m/10;
            l++;
        }
        m=n;
        while(m>0)
        {
            a=a+(int)Math.pow(m%10,l);
            m=m/10;
        }
        if(a==n)
        System.out.print("Narcissistic Number");
        else
        System.out.print("Not Narcissistic Number");
    }
}