import java.util.*;
class PG14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of matrix");
int n=sc.nextInt();int e=0,r=0,c=0,f=0,i=0,j=0,t=0,k=0;
int m[][]=new int[n][n];
System.out.println("Enter the elements of the matrix");
for(i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
 m[i][j]=sc.nextInt();
}}
System.out.println("The elements of the matrix are:");
for(i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
e=m[0][0];
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
if(e<m[i][j])
{
e=m[i][j];r=i+1;c=j+1;
}
}}
System.out.println("The largest element "+e+" is in row "+r+" column "+c);
f=m[0][0];
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
if(f<m[i][j]&&e>m[i][j])
{
f=m[i][j];r=i+1;c=j+1;
}
}}
System.out.println("The second largest element "+f+" is in row "+r+" column "+c);
System.out.println("The elements after arranging each row in ascending order:");
for( i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
for( k=0;k<n-1-j;k++)
{
if(m[i][k]>m[i][k+1])
{
t=m[i][k];
m[i][k]=m[i][k+1];
m[i][k+1]=t;
}}}}
for( i=0;i<n;i++)
{
for( j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}}}