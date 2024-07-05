import java.util.*;
import java.io.*;
class Sorter
{
static int n;
static int a[];
void Sorter()
{
n=0;
}
void readlist()
{
Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter the array elements");
for (int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
}
void display()
{
for (int i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println();
}
int indexofmin(int startindex)
{
int index=startindex;
for (int i=startindex;i<n;i++)
{
if(a[i]<=a[index])
index=i;
}
return index;
}
void selection()
{
Sorter ab= new Sorter();
for (int i=0;i<n;i++)
{
int min=ab.indexofmin(i);
int temp=a[min];
a[min]=a[i];
a[i]=temp;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Sorter obj=new Sorter();
obj.readlist();
System.out.println("Array Elements are"); 
obj.display();
obj.selection();
System.out.println("Array after sorting");
obj.display();
}


}


