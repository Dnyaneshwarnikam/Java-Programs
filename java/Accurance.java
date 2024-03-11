import java.util.*;
public class Accurance
{
   public static void main(String x[])
   {
      int i,j,count,k=-1;
      int a[]=new int[10];
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter Values In Array :");
      for(i=0;i<10;i++)
      {
        a[i]=xyz.nextInt();
      }
      for(i=0;i<a.length;i++)
      {
         count=1;
         for(j=i+1;j<a.length;j++)
         {   
            if(a[i]==a[j])
            { 
               count++;
               a[j]=k;
            }
          }
          if(a[i]!=k)
          {
            System.out.printf("%d--->%d\n",a[i],count);
          }
       }
     }
}    
    
               

      