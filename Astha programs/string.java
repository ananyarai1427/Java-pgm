import java.util.*;
class string
{
    public static void main()
    { Scanner sc =new Scanner(System.in);
        System.out.println("enter");
        String ch =sc.nextLine();
        int i;
        char d;
        for(int j =0;j<ch.length();j++)
        {
         i=(int)ch.charAt(j)-32;
         d=(char)i;
             System.out.println(d);
        }
}
}