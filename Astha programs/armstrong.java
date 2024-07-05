import java.util.*;
class armstrong
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int d= sc.nextInt();
        int c=d;
        int x=0;
        while(d>0)
        {
            int a= d % 10;
            x=x+(a*a*a);
            d=d/10;
        }
         if(c==x)
         System.out.println("armstrong hai be");
         else
         System.out.println("nahi ");
        }
    }
