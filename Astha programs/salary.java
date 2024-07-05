import java.util.*;
class salary
{
    String name,address,subject;
    long phone;
    double monthly,income;
    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter address");
        address = sc.nextLine();
        System.out.println("enter subject");
        subject = sc.nextLine();
        System.out.println("enter phone number");
        phone = sc.nextLong();
        System.out.println("enter monthly salary");
        monthly = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Name "+ name);
        System.out.println("Address "+address);
        System.out.println("Subject "+subject);
        System.out.println("Phone number "+phone);
        System.out.println("Monthly salary "+monthly);
    }
    void compute()
    {
        if(monthly>175000 )
        {
        income=(monthly*5.0)/100.0;
        System.out.print("Income Tax: "+income);
        }
        else
        System.out.println("Income tax"+ income);
    }
    public static void main()
    {
    
        salary ob = new salary();
        ob.details();
        ob.display();
        ob.compute();
    }
}