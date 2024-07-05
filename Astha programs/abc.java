import java .util.*;
class abc
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);     
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();
    
        if(a>b && a>c)
        System.out.println("The largest is "+a);
        else if(b>a && b>c)
        System.out.println("The largest is "+b);
        else if(c>b && c>a)
        System.out.println("The largest is "+c);
        if(a<b &&a<c)
        System.out.println("The smallest is "+a);
        else if(b<a && b<c)
        System.out.println("The smallest is "+b);
        else if(c<a && c<b)
        System.out.println("The smallest is "+c);
        else
        System.out.print("All are equal");
        
    }
}