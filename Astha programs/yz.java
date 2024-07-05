import java .util.*;
class yz
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumer number");
        long con_num= sc.nextLong();
        System.out.println("Enter no.of units consumed");
        int n = sc.nextInt();
        double bill = 0.0;
        if(n<=100)
        bill = 0.0;
        else if(n>100 && n<=300)
        bill = (n-100)*1.0;
        else if(n>300 && n<=500)
        bill =(n-300)*1.55 +(200*1.0);
        else if(n>500 && n<=1000)
        bill = (200*1.0)+(200*1.55)+((n-500)*2.10);
        else
        System.out.println("Wrong input");
        System.out.println("Consumer number = "+ con_num);
        System.out.println("Total bill = "+(bill+200.0));
    }
}