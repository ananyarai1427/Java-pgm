import java.util.*;
class PG13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of matrix");
int m=sc.nextInt();int c=0;int n[][]=new int[m][m];
if(m<2||m>20)
{
System.out.println("Size out of range");c++;
}
int i=0,j=0,temp=0;
if(c==0)
{

System.out.println("Enter the elements of the matrix");
for(i=0;i<m;i++)
{
for( j=0;j<m;j++)
{
 n[i][j]=sc.nextInt();
}}
System.out.println("The elements of the matrix are:");
for(i=0;i<m;i++)
{
for( j=0;j<m;j++)
{
System.out.print(n[i][j]+" ");
}
System.out.println();
}
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
if(j==m-1)
{
temp=n[i][j];
n[i][j]=n[i][0];
n[i][0]=temp;
}
}}
System.out.println("Mirror image matrix");
for(i=0;i<m;i++)
{
for( j=0;j<m;j++)
{
System.out.print(n[i][j]+" ");
}
System.out.println();
}}
}}