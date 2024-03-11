import java.util.*;
class Area
{
   float radius,pi=3.14f;
   Area()
  {
    
  }
  void setRadius(float radius)
  {
    this.radius=radius;
  }
  void getDisplay()
  {
     float area=radius*radius*pi;
     System.out.println(area);
  }
}
public class AreaEx
{
  public static void main(String []x)
  {
      Area a=new Area();
      float radius;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter Radius :");
      radius=xyz.nextInt();
      a.setRadius(radius);
      a.getDisplay();
   }
}
      