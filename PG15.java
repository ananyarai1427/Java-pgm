import java.util.*;
class PG15
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("INPUT: ");
System.out.print("Day in first january : ");
String s=sc.next();
System.out.print("Year: ");
int y=sc.nextInt();
System.out.print("Enter a date: ");
int d=sc.nextInt();
int n[]={31,28,31,30,31,30,31,31,30,31,30,31};
int q[]=new int[3];int g;
int count=0;
String w[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
int sum=0;
if(y%4==0)
{
n[1]=29;
}
for (int k=0;k<3;k++)
{
if (d!=0)
{
q[k]=d%100;
d=d/100;
}
}
for (int k=0;k<q[1]-1;k++)
{
sum=sum+n[k];
}
sum=sum+q[2];
g=sum%7;
for (int i=0;i<7;i++)
{
String hh=w[i];
int nn=s.compareTo(hh);
int ne=(int)nn;
if (ne==0)
{
count++;
g=g+i;
}
}
if (count>0)
{
g=g%7;
g=g-1;
System.out.println("Day is "+w[g]);
}
}
}