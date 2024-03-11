import java.util.*;
class Circle
{
    float radius,area;
    void setRadius(float radius)
    {
      this.radius=radius;
    }
    void showArea()
    {
      area=radius*radius*3.14f;
      System.out.printf("%f",area);
    }
}
public class AreaApp
{
   public static void main(String x[])
   {
      float radius;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter Radius :");
      radius=xyz.nextInt();
      Circle c=new Circle();
      c.setRadius(radius);
      c.showArea();
    }
}
      