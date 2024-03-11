import java.util.*;
public class Swapno
{
  public static void main(String x[])
  {
    int a,b,temp;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter A:");
    a=scanner.nextInt();
    System.out.println("Enter B:");
    b=scanner.nextInt();
    temp=a;
    a=b;
    b=temp;
    System.out.println("After Swaping");
    System.out.println("A is :"+a);
    System.out.println("B is :"+b);
  }
}