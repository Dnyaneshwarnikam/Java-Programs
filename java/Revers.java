import java.util.*;
public class Revers
{
 public static void main(String x[])
 { 
   int rev=0,no,rem,temp;
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter No :");
   no=xyz.nextInt();
   //temp=no;
   while(no!=0)
   {  
      rem=no%10;
      no=no/10;
      rev=rev*10+rem;
   }
    System.out.printf("%d",rev);
  }
}



   