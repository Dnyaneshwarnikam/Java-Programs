import java.util.*;
class getPower
{
   int base,index;
   void setValue(int base,int index)
   {
      this.base=base;
      this.index=index;
   }
   void Show()
   {
     int p=1;
     for(int i=1;i<=index;i++)
     {
       p=p*base;
     }
     System.out.println("Power is :"+p);
    // return power;
   }
}
public class Power
{
   public static void main(String x[])
 {
   int base,index;
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter Base and Index :");
   base=xyz.nextInt();
   index=xyz.nextInt();
   getPower p1=new getPower();
   p1.setValue(base,index);
   p1.Show();
 }
}

  
      