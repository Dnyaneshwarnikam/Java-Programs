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
      System.out.printf("%d",area);
    }
}
public class AreaApp
{
   public static void main(String x[])
   {
      flaot radius;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter Radius :");
      radius=xyz.nextInt();
      Circle c;
      c.setRadius(radius);
      c.showArea();
    }
}
      