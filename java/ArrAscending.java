import java.util.*;
public class ArrAscending
{
  public static void main(String x[])
  {
    int i,j,temp;
    int a[]=new int[5]; 
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Values In Array :");
    for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
    for(i=0;i<a.length;i++)
    {
      for(j=i+1;j<a.length;j++)
      {
       if(a[i]>a[j])
       {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
       }
      }
    }
    for(i=0;i<a.length;i++)
    {
      System.out.printf("Array in Ascending Order :%d\n",a[i]);
    }
   }
}

















   
       
    