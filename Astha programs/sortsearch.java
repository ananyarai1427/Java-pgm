import java.util.*;
class sortsearch
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter search elements");
        int s=sc.nextInt();
        int f=0;
        int l= a.length-1;
        while(f<=l)
        {
          int m=(f+l)/2;
          if(a[m]==s)
          {
              System.out.println("Element found at "+m);
              break;
          }
          else if(a[m]<s)
          f=m+1;
          else
          l=m-1;
        }
        if(f>l)
        System.out.println("Element not found");
    }
}