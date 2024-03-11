import java.util.*;
abstract class Value{
   
   abstract void performOperation();
   
   void setValue(int a,int b)
   {
       this.a=a;
       this.b=b;
   }
}
class Add extends Value{
   public void performOperation(){
      
      int res=a+b;
      System.out.println("Addition is :"+res);
   }
}
class Sub extends Value{
   public void performOperation(){
      
      int res1=a-b;
      System.out.println("Substraction is :"+res1);
   }
}
class Mul extends Value{
   public void performOperation(){
      
      int res2=a*b;
      System.out.println("Multiplication is :"+res2);
   }
}
class Div extends Value{
   public void performOperation(){
      
      int res3=a/b;
      System.out.println("Division is :"+res3);
   }
}
class Calculator{
 
  public void getResult(Value v)
  {
       v.performOperation();
  }
}
public class ValueApp{
   public static void main(String x[])
   {

    
    
    

