import java.util.*;
class Sum
{
   int sum=0,i;
   void calSum(int ...x)
   {
     for(i=0;i<x.length;i++)
     {
       sum=sum+x[i];
     }
     System.out.println("Sum is:"+sum);
   }
}
public class SumApp
{
   public static void main(String x[])
   {
      int a[]=new int[5];
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter Values:");
      for(int i=0;i<5;i++)
      {
       a[i]=xyz.nextInt();
      }
      Sum s1=new Sum();
      s1.calSum(a);
    }
}
      
      