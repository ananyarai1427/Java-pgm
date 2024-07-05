import java.util.*;
class ccaa2ab
{
    public static void main()
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter");
    double a=sc.nextDouble();
    double c;
    double b=3.0;
        if(a>=1.0 && a<=20.0)
        {
          a=a+2.0;
          c=a*a+2*a*b;
          System.out.println(c);
        }
        else
        System.out.println("wrong input");
    }
}