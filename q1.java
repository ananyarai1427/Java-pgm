import java.util.*;
class q1
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

q1 obj=new q1();

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
}
}
}
System.out.println();
System.out.println("FREQUENCY OF PRIME ADAM INTEGER IS:"+c);

}
}