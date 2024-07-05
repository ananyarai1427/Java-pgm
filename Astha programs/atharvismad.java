import java.util.*;
class atharvismad
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i;
    do
    {
    System.out.println("1: add");
    System.out.println("2: subtract");
    System.out.println("3: multiply");
    System.out.println("4: divide");
    System.out.println("5 : exit");
    System.out.println("Enter your choice");
     i=sc.nextInt();
    switch(i)
    {
        case 1:
        System.out.println("Enter first number");
        long r=sc.nextLong();
        System.out.println("Enter second number");
        long s=sc.nextLong();
        long m=r+s;
        System.out.println(m);
        break;
        case 2:
            System.out.println("Enter first number");
        long q=sc.nextLong();
        System.out.println("Enter second number");
        long w=sc.nextLong();
        long e=q-w;
        System.out.println(e);
        break;
        case 3:
        System.out.println("Enter first number");
        long t=sc.nextLong();
        System.out.println("Enter second number");
        long y=sc.nextLong();
        long u=y*t;
        System.out.println(u);
        break;
        case 4:
            System.out.println("Enter first number");
        double k=sc.nextDouble();
        System.out.println("Enter second number");
        double l=sc.nextDouble();
        double f=k/l;
        System.out.println(f);
        break;
        case 5:
            System.out.println("exiting");
         break;
         default:
             System.out.println("Wrong input");
            }
            }while(i!=5);    
        
        }
    }
        
    
    
    
        
    

