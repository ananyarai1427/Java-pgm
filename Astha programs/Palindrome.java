import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int m=n,a=0;
        while(m>0)
        {
            int r=m%10;
            a=a*10+r;
            m=m/10;
        }
        if(n==a)
            System.out.print("Palindrome Number");
            else
            System.out.print("Not Palindrome");
        }
}