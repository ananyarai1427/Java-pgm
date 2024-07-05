import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the size of less than 20");
int l=Sc.nextInt();
int m[][]=new int[l][l];
for(int i=0;i<l;i++)
{
for(int j=0;j<l;j++)
{
System.out.println("Enter element");
m[i][j]=Sc.nextInt();
}
}
for(int i=0;i<l;i++)
{
for(int j=0;j<l;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
int s=0; int t=0;  int min=0; int max=0; int f=0; int flag=0; int flagv=0;
for(int i=0;i<l-2;i++)
{
for(int j=0;j<l-2;j++)
{
if((m[i][j]<m[i][j+1])&&(m[i][j]<m[i][j+2])&&(m[i][j]>m[i+1][j])&&(m[i][j]>m[i+2][j]))
{s=i; t=j; flagv=1;}
else if((m[i][j]>m[i][j+1])&&(m[i][j]>m[i][j+2])&&(m[i][j]<m[i+1][j])&&(m[i][j]<m[i+2][j]))
{
min=Math.min(m[i][j+1],m[i][j+2]);
max=Math.max(m[i+1][j],m[i+2][j]);
if(min==max)
flag=1;
}
else
{
f=1;
}
}
}
if(flagv==1)
System.out.println("Saddle point="+m[s][t]);
else if(flag==1)
System.out.println("Saddle point ="+min);
else
System.out.println("NO SADDLE POINT");
for(int i=0;i<l-1;i++)
{
for(int j=0;j<l-1;j++)
{
for(int k=0;k<l-i-1;k++)
{
if(m[i][i]>m[i+1][i+1])
{
int a=m[i][i];
m[i][i]=m[i+1][i+1];
m[i+1][i+1]=a;
}
}
}
}
System.out.println("Matrix after sorting the principal diagonal");
for(int i=0;i<l;i++)
{
for(int j=0;j<l;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}}
}




