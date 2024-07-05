import java.util.*;
class pg1
{
     public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int e=0;
        int o=0;
        while(n>0)
        {
          int a =n%10;
          n=n/10;
          if(a%2==0)
          e=a+e;
          else
          o=o+a;
          
          
        }
        if(o==e)
            System.out.println("lead pencil");
            else
            System.out.println("NO no ");
    
    }
}