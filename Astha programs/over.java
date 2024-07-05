import java.util.*;
class over
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of calls");
        int noc=sc.nextInt();
        double mtl=0.0;
        if(noc>0 && noc<=100)
        mtl=0.0;
        else if(noc>100 && noc<=250)
        mtl=(noc-100)*1.25;
        else
        mtl=(150*1.25)+(noc-250)*1.50;
        mtl=mtl+400;
        System.out.println("monthly telephone bill "+mtl);
        
        
    }
}