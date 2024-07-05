import java.util.*;
class b2019_q5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to generate letters and their unicode"+ '\n' +"Enter 2 to print pattern"+ '\n' +"Enter 3 to exit"+ '\n' +"Enter your choice");
        int n=sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Letters  Unicode");
                    for (char u='A';u<='Z';u++)
                    {
                        int h=(int)u;
                        System.out.print(u+" " +" "+h);
                        System.out.println();
                    }
                    break;
            case 2 : 
                    for(int i=1;i<=5;i++)
                    { int c=1;
                        for(int j=1;j<=i;j++)
                        {
                          System.out.print(c + " "); 
                          c=c+1;
                        }
                        System.out.println();
                        
                    }
                    break;
            case 3 :
                System.out.println("Exiting");
                break;
            default : System.out.println("WRONG INPUT");
            
        }
    }
}