import java.util.*;
class Power
{  
   int base,index;
   Power(int base,int index)
   {
      this.base=base;
      this.index=index;

   }
   int getPower()
   {  int p=1;
      for(int i=1;i<index;i++)
      {
         p=base*p;  
      }
      return p;
   }
}
public class PowerApp
{
   public static void main(String []x)
   {
      Power p=new Power(5,3);
      int result=p.getPower();
      System.out.println("Power is:"+result);
   }
}
     
    
