class ABCDE
{
 public static void mains()
 {   int c=65;
     for(int i=65;i<=69;i++)
     {
         for(int j=65;j<=i;j++)
         {
             System.out.print((char)c+" ");
             c++;
         }
         c=65;
         System.out.println();
     }
 }
}