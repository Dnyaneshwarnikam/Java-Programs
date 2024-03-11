import java.util.*;
class Rectangle
{
  int len,wid,rectangle;
  void setLengthWidth(int len,int wid)
  {
    this.len=len;
    this.wid=wid;
  }
  void show()
  {
    rectangle=len*wid;
    System.out.printf("%d",rectangle);
  }
}
public class AreaRect
{
   public static void main(String x[])
   {
     int len,wid;
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Length And Width :");
     len=xyz.nextInt();
     wid=xyz.nextInt();
     Rectangle r=new Rectangle();
     r.setLengthWidth(len,wid);
     r.show();
   }
}

    