import java.util.*;
class Factorial
{
   private int x,fact=1;
   public void setValue(int x)
   {
     this.x=x;
   }
   public int getFactorial()
   {
      for(int i=1;i<=x;i++)
      {
           fact=fact*i;
      }
     return fact;
   }
}
public class FactorialApp
{
   public static void main(String x[])
   {
     int no,res;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter No:");
     no=sc.nextInt();

     Factorial f=new Factorial();
     f.setValue(no);
     res=f.getFactorial();
     System.out.println(res);
    }
}
     
      
      