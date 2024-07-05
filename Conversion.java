import java.util.*;
class Conversion
{
Scanner sc=new Scanner(System.in);
void DecToHexa(int a)
{
int rem;
String s="";
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
if(a==0)
s="0";
while(a>0)
{
rem=a%16;
s=hex[rem]+s;
a=a/16;
}

System.out.println(s);
}
void HexaToDec(String b)
{
String k=sc.nextLine();
b=b+k;
String hs="0123456789ABCDEF";
b=b.toUpperCase();
int n=0;
for(int i=0;i<b.length();i++)
{
char c=b.charAt(i);
int m=hs.indexOf(c);
n=16*n+m;
}
System.out.println(n);
}
void DecToBin(int c)
{
int a;String x="";
if(c==0)
x="0";
while(c>0)
{
a=c%2;
x=a+" "+x;
c=c/2;
}

System.out.println(x);
}
public static void main(String args[])
{
int fp=1;
while(fp!=0)
{
System.out.println("Enter 0 for exit");
System.out.println("Enter 1 for converting a decimal number to hexadecimal number");
System.out.println("Enter 2 for converting a hexadecimal number to decimal number");
System.out.println("Enter 3 for converting a decimal number to binary number");
Scanner sc=new Scanner(System.in);
int in=sc.nextInt();String bn="";
if(in!=0)
System.out.println("Enter the number for conversion");
Conversion ob=new Conversion();
if(in==1)
{
int num=sc.nextInt();
ob.DecToHexa(num);
}
if(in==2)
ob.HexaToDec(bn);
if(in==3)
{
int num=sc.nextInt();
ob.DecToBin(num);
}
fp=in;
}
}}