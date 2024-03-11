import java.util.*;
public class Max
{
   public static void main(String x[])
   {
     int max,i;
     int a[]=new int [5];
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Values in Array");
     for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }
      max=a[0];
     for(i=0;i<a.length;i++)
     {
        if(a[i]>max)
        {
          max=a[i];
        }
     }
      System.out.println("max is :"+max);
     }
}