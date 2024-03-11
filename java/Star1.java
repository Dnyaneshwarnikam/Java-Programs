import java.util.*;
public class Star1
{
  public static void main(String x[])
  {
      int i,j;
      for(i=5;i>=1;i--)
      {
         for(j=1;j<=5;j++)
         {
           if(j<=i)
           {
             System.out.print(j);
           }
         }
         System.out.printf("\n");
      }
   }
}