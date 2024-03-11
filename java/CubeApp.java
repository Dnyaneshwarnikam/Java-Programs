import java.util.*;
class Cube
{
   private int x,cube;
   public void setCube(int x)
   {
      this.x=x;
   }
   public int getCube()
   {
     cube=x*x*x;
     return cube; 
   }

}
public class CubeApp
{
  public static void main(String x[])
  {
     int no,res;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter No:");
     no=sc.nextInt();
     
     Cube c=new Cube();
     c.setCube(no);
     res=c.getCube();
     System.out.println(res);
   }
}
   