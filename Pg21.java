import java.util.*;
import java.io.*;
class Pg21
{
static String a="class.dat";
public static void main(String args[])throws IOException
{

Scanner sc = new Scanner(System.in);
FileOutputStream fw=new FileOutputStream(a);
DataOutputStream dw=new DataOutputStream(fw);
int p=1;
while(p==1)
{
System.out.println("Enter name of the student");
String b=sc.next();
System.out.println("Enter marks");
System.out.println("Maths");
double m=sc.nextDouble();
System.out.println("Chemistry");
double c=sc.nextDouble();
System.out.println("Physics");
double ph=sc.nextDouble();
System.out.println("Biology");
double bio=sc.nextDouble();
System.out.println("English");
double e=sc.nextDouble();
System.out.println("Computer");
double com=sc.nextDouble();
double t=m+c+ph+bio+e+com;
double per=(t/600)*100;
dw.writeUTF(b);
dw.writeDouble(m);
dw.writeDouble(c);
dw.writeDouble(ph);
dw.writeDouble(bio);
dw.writeDouble(e);
dw.writeDouble(com);
dw.writeDouble(t);
dw.writeDouble(per);
System.out.println("Do you want to enter more value ?");
System.out.println("If yes then press 1 else press 0");
p=sc.nextInt();
}
dw.close();
fw.close();
int k=1,count;
while(k==1)
{
count=0;
boolean EOF=false;
System.out.println("Enter name to search");
String ss=sc.next();
FileInputStream fi=new FileInputStream(a);
DataInputStream di=new DataInputStream(fi);
String s="";
double m1,m2,m3,m4,m5,m6,tot,perp;
while(!EOF)
{
try
{
s=di.readUTF();
m1=di.readDouble();
m2=di.readDouble();
m3=di.readDouble();
m4=di.readDouble();
m5=di.readDouble();
m6=di.readDouble();
tot=di.readDouble();
perp=di.readDouble();
if(ss.equals(s))
{
count++;
System.out.println("Name    "+s);
System.out.println("maths       "+m1);
System.out.println("Chemistry   "+m2);
System.out.println("Physics     "+m3);
System.out.println("Biology     "+m4);
System.out.println("English     "+m5);
System.out.println("Computer    "+m6);
System.out.println("Total       "+tot);
System.out.println("Percentage  "+perp);
}

}

catch(EOFException el)
{
EOF=true;
}
}
if(count==0)
{
System.out.println("Record not found");
}
System.out.println("Do you want to enter more value ?");
System.out.println("If yes then press 1 else press 0");
k=sc.nextInt();
}
}
}