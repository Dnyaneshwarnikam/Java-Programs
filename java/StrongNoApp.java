import java.util.*;
public class StrongNoApp
{
   public static void main(String x[])
   {
      int no,i,rem,mul,sum=0,fact;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter No");
      no=xyz.nextInt();
      int temp=no;
      while(no>0)
      {
         rem=no%10;
         fact=1;
         for(i=1;i<=rem;i++)
        {
           fact=fact*i;
        }
        //System.out.println(fact);
        
        sum=sum+fact;
        no=no/10;
      }
      
      if(sum==temp)
      {
        System.out.println("Strong No");
      }
      else
      {
        System.out.println("Not Strong No");
      }
   }
} 

    
          
        
          