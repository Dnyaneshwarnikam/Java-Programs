import java.util.Scanner;
public class Checkgretar
{
   public static void main(String x[])
   {
      int a,b,c;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter Three No :");
      a=scanner.nextInt();
      b=scanner.nextInt();
      c=scanner.nextInt();
      if(a>b)
      System.out.println("A is Gretar");

      else if(b>c)
      System.out.println("B is Gretar");

      else
      System.out.println("C is Gretar");
   }
}
      