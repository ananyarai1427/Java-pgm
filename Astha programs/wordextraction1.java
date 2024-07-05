import java.util.*;
class wordextraction1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        String ns="",nl="";
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            ns=ns+s.charAt(i);
            if(s.charAt(i)==' ')
            {
                nl=nl+ns.charAt(0);
                ns="";
            }
        }
        System.out.print("New string: "+nl);
    }
}