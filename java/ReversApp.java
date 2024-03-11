import java.util.*;
public class ReversApp
{
  public static void main(String x[])
{
   int rev=0,rem,no;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter No:");
   no=sc.nextInt();
   while(no!=0)
   {
      rem=no%10;
      no=no/10;
      rev=rev*10+rem;
   }
   System.out.println(rev);
}}