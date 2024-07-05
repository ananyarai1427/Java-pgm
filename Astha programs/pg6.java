import java.util.*;
class pg6
{
    public static void main(int n)
{
    int e=0,f=0;
    for(int i=1;i<=n;i++)
    {
        if(i%2 ==0)
        e=e+i;
        else
        f=f-i;
        
    }
    System.out.println(e+f);
}
}