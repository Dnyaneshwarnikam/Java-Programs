import java.util.*;
public class Minimum
{
   public static void main(String x[])
   {
     int min,i;
     int a[]=new int[5];
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Values in Array :");
     for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }
     min=a[0];
     for(i=0;i<a.length;i++)
     { 
       if(a[i]<min)
       {
        min=a[i];
       }
     }
      System.out.println("Minnimum Value is :"+min);
     }
}
       