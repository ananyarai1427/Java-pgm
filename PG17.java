import java.util.*;
class PG17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=0;
System.out.println("INPUT: ");
System.out.print("Day Number: ");
int d=sc.nextInt();
System.out.print("Enter the year: ");
int y=sc.nextInt();
System.out.print("Days after (N): ");
int a=sc.nextInt();
String j[]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
int h[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
if(y%4==0)
{
h[2]=29;
}
int sum=0,m=0,i;
for (i=1;i<=12;i++)
{sum=sum+h[i];
if(d<sum||d==sum)
{
sum=sum-h[i];
m=i;
break;
}
}
int t=d-sum;
System.out.print(t+"");
if(t>=4)
{
System.out.print("th");
}
System.out.print(" "+j[m]+" "+y);
System.out.println();
System.out.print("DATE AFTER "+a+" DAYS :");
d=d+a;
sum=0;m=0;
int g=0;
for (i=1;i<=24;i++)
{
if(i>12)
{
g++;
i=i-12;
}
sum=sum+h[i];
if(d<sum||d==sum)
{
sum=sum-h[i];
m=i;
break;
}
}
if(g>0)
y++;
if(m>12)
{
m=m-12;
y++;
}
t=d-sum;
System.out.print(t+"");
if(t>=4)
{
System.out.print("th");
}
System.out.print(" "+j[m]+" "+y);
System.out.println();
}
}