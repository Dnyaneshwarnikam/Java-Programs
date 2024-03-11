import java.util.*;
public class ArrIndex
{
  public static void main(String x[])
  {
   int i,index,value;
   int a[]=new int[6];
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter Values In Array :");
   for(i=0;i<5;i++)
   {
    a[i]=xyz.nextInt();
   }
    System.out.println("Enter Index:");
    index=xyz.nextInt();
    System.out.println("Enter Insert Value :");
    value=xyz.nextInt();
    for(i=a.length-2;i>=index;i--)
    {
       a[i+1]=a[i];
    }
    a[index]=value;
    for(i=0;i<6;i++)
    {
     System.out.printf("[%d]---->%d\n",i,a[i]);
    }
   }
}

   
