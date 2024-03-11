import java.util.*;
public class ArrRotate
{
   public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
      int a[]=new int[11];
      System.out.println("Enter Arrya Values:");
      for(int i=0;i<a.length;i++)
      {
         a[i]=xyz.nextInt();
      }
      System.out.println("Enter Index No For Rotate:");
      int index=xyz.nextInt();
      
      int len=a.length;
     
     for(int i=0;i<=index;i++)
     {
        int temp=a[0];
         
       for(int j=0;j<a.length-1;j++)
       {
        a[j]=a[j+1];
       }
       a[a.length-1]=temp;  
     }
     for(int i=0;i<a.length;i++)
     {
         System.out.print("\t"+a[i]);
     }
  }
}
    
    
     
      
        
 