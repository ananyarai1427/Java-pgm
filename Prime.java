import java.io.*;
import java.util.*;
class Prime
{
static int arr[][];static int pn[];static int m,n;
Prime()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
m=sc.nextInt();
System.out.println("Enter number of columns");
n=sc.nextInt();
}
int isPrime(int p)
{
int c=0;
for(int i=1;i<=p;i++)
{
if(p%i==0)
c++;
}
if(c==2)
return 1;
else
return 0;
}
void fill()
{
int k=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=pn[k];
k++;
}}}
void display()
{
System.out.println("Required prime matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
System.out.print(arr[i][j]+"\t");
System.out.println();
}}
public static void main(String args[])
{
Prime ob=new Prime();
arr=new int[m][n];
pn=new int[m*n];
int i=0,j,k=2;
while(i<m*n)
{
if(ob.isPrime(k)==1)
{
pn[i]=k;i++;
}
k++;
}
ob.fill();ob.display();
}}