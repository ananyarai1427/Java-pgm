import java.io.*;
class file
{
public static void main(String args[])throws IOException
{
FileInputStream fin=new FileInputStream( "E:\\text.txt" );
int n,c=0;
while((n=fin.read())!=-1)
{
char ch=(char)n;
if(Character.isUpperCase(ch))
{
System.out.println(ch);
c++;
}}
System.out.println(c);
}}