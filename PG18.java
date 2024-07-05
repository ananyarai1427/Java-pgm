import java.util.*;
class PG18
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the matrix");
int n=sc.nextInt();int temp;
int m[][]=new int[n][n];
System.out.println("Enter the elements of the matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
m[i][j]=sc.nextInt();
}}
System.out.println("ORIGINAL MATRIX");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
for(int k=0;k<n*n;k++)
{
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==0&&j!=n-1&&m[i][j+1]<m[i][j])
{
temp=m[i][j+1];
m[i][j+1]=m[i][j];
m[i][j]=temp;
}
if(j==0&&i!=n-1&&m[i+1][j]>m[i][j]&&i!=0)
{
temp=m[i][j];
m[i][j]=m[i+1][j];
m[i+1][j]=temp;
}
if(j==n-1&&i!=n-1&&m[i+1][j]<m[i][j])
{
temp=m[i][j];
m[i][j]=m[i+1][j];
m[i+1][j]=temp;
}
if(i==n-1&&j!=n-1&&m[i][j+1]>m[i][j])
{
temp=m[i][j+1];
m[i][j+1]=m[i][j];
m[i][j]=temp;
}
}}}
System.out.println("REARRANGED MATRIX");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(m[i][j]+"\t");
}
System.out.println();
}
int sum=0;
System.out.println("BOUNDARY ELEMENTS");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==0||j==0||i==n-1||j==n-1)
{
System.out.print(m[i][j]);
sum=sum+m[i][j];
}
System.out.print("\t");
}
System.out.println();
}
System.out.println("SUM OF THE BOUNDARY ELEMENTS="+sum);
}}