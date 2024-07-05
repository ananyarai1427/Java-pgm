import java.util.*;
import java.io.*;
class Phone
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
FileWriter fout=new FileWriter("phonebill.txt");
BufferedWriter bw=new BufferedWriter(fout);
PrintWriter pw=new PrintWriter(bw);
int p=1;
pw.print("Phone no.      ");
pw.print("Name        ");
pw.print("Total calls   ");
pw.println("Amount");
double r=0,a;
while(p==1)
{
System.out.println("enter phone no.");
String j=sc.next();
pw.print(j+"    ");
System.out.println("enter the name");
String s=sc.next();
pw.print(s+"         ");
System.out.println("enter the total calls");
int n=sc.nextInt();
pw.print(n+"             ");
if (n<=100&&n>0)
r=0;
else if(n<=200&&n>100)
{
r=1;
n=n-100;
}
else if(n<=300&&n>200)
{
r=1.2;
n=n-200;
}else
{
n=n-300;
r=1.5;
}
a=(r*n)+500;
pw.println(a);
System.out.println("Do you want to enter more value ?");
System.out.println("If yes then press 1 else press 0");
p=sc.nextInt();
}
pw.close();
bw.close();
fout.close();
sc.close();
FileReader fr=new FileReader("phonebill.txt");
BufferedReader br=new BufferedReader(fr);
System.out.println("Name       "+" Phone number ");
String s="",g="";
double dd;int i=0;
while((s=br.readLine())!=null)
{
if(i>0)
{

StringTokenizer str=new StringTokenizer(s);
g=str.nextToken();
String pp=str.nextToken();
int k=Integer.parseInt(str.nextToken());
String m=str.nextToken();
if(k<=100)
{
System.out.println(pp+"        "+g);
}
}
i++;
}


 
}}