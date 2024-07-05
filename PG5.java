import java.util.*;
class PG5
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int d,m,y,p,q;String ns="";
    int dn[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    String mn[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
    System.out.println("Enter a date in dd/mm/yyyy format:");
    String s=sc.next();
    p=s.indexOf('/');
    q=s.lastIndexOf('/');
    d=Integer.parseInt(s.substring(0,p));
    m=Integer.parseInt(s.substring(p+1,q));
    y=Integer.parseInt(s.substring(q+1));
    if(y<=0||y>9999)
    System.out.println("Invalid year");
    if(y%4==0)
    dn[2]=29;
    if(m<=0||m>12)
    System.out.println("Invalid month");
    else if(d<=0||d>dn[m])
    System.out.println("Invalid day");
    else
    {
        if(d==1||d==21||d==31)
        ns="st";
        if(d==2||d==22)
        ns="nd";
        if(d==3||d==23)
        ns="rd";
        if(d>=4&&d<=20)
        ns="th";
        if(d>=24&&d<=30)
        ns="th";
        System.out.println("Date is: "+d+ns+" "+mn[m]+","+y);
        System.out.println("Valid date");
    }}}