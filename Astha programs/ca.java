import java.util.*;
class ca
{
    public static void main()
    {   Scanner sc=new Scanner(System.in);
        char ch[]=new char[10];
        char lc='z';
        char hc='A';
        System.out.println("Enter 10 character elements");
        for(int i=0;i<10;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        for(int i=0;i<10;i++)
        {
            if(i<9)
            System.out.print("'"+ch[i]+"'"+" , ");
            else
            System.out.print("'"+ch[i]+"'");
        }
        System.out.println();
        for(int i=0;i<10;i++)
        {
          if((int)lc>(int)ch[i])
          lc=ch[i];
          if((int)hc<(int)ch[i])
          hc=ch[i];
        }
        System.out.println("lowest "+lc);
        System.out.println("highest "+hc);
    }
}