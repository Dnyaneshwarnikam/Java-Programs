import java.util.Scanner;
public class No
{
   public static void main(String x[])
    { 
      int no,i,sum=0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter No :");
      no=scanner.nextInt();
      scanner.close();
      for(i=1;i<=no;i++)
      {
         sum=sum+i;
      }
      System.out.println("Sum is :"+sum);
    }  
}