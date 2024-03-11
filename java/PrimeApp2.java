import java.util.*;
public class PrimeApp2
{
 public static void main(String x[])
 {
   int no,flag=1,sum=0,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Values :");
   no=sc.nextInt();
   for(i=2;i<=no;i++)
   {
      if(no%i==0)
       {
          flag=0;
          break;
       }
   }
   if(flag==1)
   {
     System.out.println("Prime No");
   }
   else
   {
     System.out.println("Not prime no");
   }
  }
}

   
     
   
  