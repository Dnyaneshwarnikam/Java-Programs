import java.util.*;
public class Checkevenodd
{
   public static void main(String x[])
   {
      int no;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter No :");
      no=scanner.nextInt();
      if(no%2==0)
      System.out.println("Even");
      else
      System.out.println("Odd");
   }  
}