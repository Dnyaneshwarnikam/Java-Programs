import java.util.*;
public class Swap
{
  public static void main(String x[])
  {
    int a,b,temp;
    System.out.println("Enter Two No :");
    a=Integer.parseInt(x[0]);
    b=Integer.parseInt(x[1]);
    temp=a;
    a=b;
    b=temp;
    System.out.println("After Swaping");
    System.out.printf("%d\n%d",a,b);
  }
}
