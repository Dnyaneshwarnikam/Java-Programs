import java.util.*;
public class FreqApp
{
   public static void main(String x[])
   {
      int no,rem,rem3,count;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter No");
      no=xyz.nextInt();
      int temp=no;
      int temp2=no;
      rem3=0;
      while(no!=0)
     {
        rem=no%10;
        count=0;
        temp=temp2;
        if(rem!=rem3)
        {
           while(temp!=0)
           {
             int rem2=temp%10;
             if(rem==rem2)
             {
               count++;
             }
             temp=temp/10;
           }
           System.out.printf("\n%d--->%d\n",rem,count);
        }
        no=no/10;
        rem3=rem;
     }
   }
}

             
             
         
        

       