import java.util.*;
class string1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence");
        String a=sc.nextLine();
        char c;
        int v=0,s=0;
        for(int i=0;i<a.length();i++)
        {
         c=a.charAt(i);
         if(c==' ')
         {
            s=s+1; 
         }
         else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
         {
          v=v+1;  
         }
        }
        System.out.println("The total number of space "+s);
        System.out.println("The total number of vowels "+v);
    }
}