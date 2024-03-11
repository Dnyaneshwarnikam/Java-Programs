import java.util.*;
class Fibo
{
   int f1,f2,fib;
   Fibo()
   {
     f1=0;
     f2=1;
   }
   void getDisplay()
   {
      System.out.println(f1+"  "+f2);
      for(int i=0;i<5;i++)
      {
         fib=f1+f2;
         f1=f2;
         f2=fib;
         System.out.println(fib);
       }
   }
}
public class FiboApp
{
  public static void main(String []x)
  {
      Fibo f=new Fibo();
      f.getDisplay();
  }
}