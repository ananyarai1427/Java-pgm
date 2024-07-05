import java.util.*;
import java.io.*;
class Time
{
int h,m;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter hour");

h=sc.nextInt();
System.out.println("Enter minutes");
m=sc.nextInt();
if(h>24||m>60)
{
System.out.println("Wrong input");
System.exit(0);
}
}
Time addTime(Time x,Time y)
{
Time ob=new Time();
h=x.h+y.h;
if((x.m+y.m)>60)
{
m=(x.m+y.m)-60;
h++;
return ob;
}
else
{
m=x.m+y.m;
return ob;
}
} 
void display()
{
if(h>24)
System.out.println(h/24+" day "+(h%24)+" hour  "+m+" minutes");
else
System.out.println(h+" hour  "+m+" minutes "); 

}
public static void main(String args[])
{
Time ob1=new Time();
Time ob2=new Time();
Time ob3=new Time();
ob1.read();
ob2.read();
ob3.addTime(ob1,ob2);
System.out.println("Time 1:");
ob1.display();
System.out.println("Time 2:");
ob2.display();
System.out.println("Added Time ");
ob1.display();

}
}