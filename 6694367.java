//UID 6694367
//INDEX NO. 069
//Q.NO. 1
import java.util.*;
class Padam
{
int reve(int a )
{
int p=0;
int y=0;
while (a>0)
{
p=a%10;
y=y*10+p;
a=a/10;
}
return(y);
}
public static void main(String args[])
{
int count=0,c=0;
Scanner sc =new Scanner(System.in);
System.out.println("m=");
int m=sc.nextInt();
System.out.println("n=");
int n=sc.nextInt();
System.out.println("THE PRIME ADAM INTEGERS ARE:");
if (m>n)
System.out.println("INVALID INPUT");
Padam obj=new Padam();
for (int i=m;i<=n;i++)
{count=0;
for(int j=1;j<=i;j++)
{
if (i%j==0)
count++;
}
if (count==2)
{
int k=obj.reve(i);
int sqi=i*i;
int sqk=k*k;
int x=obj.reve(sqk);

if (x==sqi)
{
c++;
System.out.print(i+" ");
}}
}
System.out.println();
System.out.println("FREQUENCY OF PRIME ADAM INTEGER IS:"+c);
}}
OUTPUT
C:\Users\St.Joseph>E:

E:\>javac Padam.java

E:\>java Padam
m=5
n=100
THE PRIME ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME ADAM INTEGER IS:3

E:\>java Padam
m=100
n=200
THE PRIME ADAM INTEGERS ARE:
101 103 113
FREQUENCY OF PRIME ADAM INTEGER IS:3
