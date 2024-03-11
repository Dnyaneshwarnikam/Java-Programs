import java.util.*;
public class ArrSum
{
   public static void main(String x[])
   {
     int sum=0,i;
     int a[]=new int[5];
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Valus In Array");
     for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
       sum=sum+a[i];
     }
     System.out.println("Sum is :"+sum);
    }
}
     