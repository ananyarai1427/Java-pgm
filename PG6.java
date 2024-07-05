import java.util.*;
class PG6
{
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a sentence");
String s=sc.nextLine();String gg=s+" ";int mm=0,nn=0;int kk=gg.length();
int l=s.length();
for(int i=0;i<kk;i++)
{
char c=gg.charAt(i);
if(c==' ')
mm++;
}
String ns=s.substring(l-1);
String nl=s.substring(0,l-1);
StringTokenizer str=new StringTokenizer(nl);
int p=str.countTokens();
String ss[]=new String[p];
int n=0,q=0;
String temp="";
while(str.hasMoreElements())
{
for (int i=0;i<p;i++)
{
ss[i]=str.nextToken();
}
}
for (int i=0;i<p;i++)
{
for(int k=0;k<i;k++)
{
n=ss[k].length();
q=ss[k+1].length();
if (n>q)
{
temp=ss[k];
ss[k]=ss[k+1];
ss[k+1]=temp;
}
}
}
for (int i=0;i<p;i++)
{nn++;
if(mm!=nn)
System.out.print(ss[i]+" ");
else
System.out.print(ss[i]);
}
System.out.println(ns);
}
}