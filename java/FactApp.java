import java.util.*;
class Fact
{
  int fact,no;
  Fact()
  {
     fact=1;
  }
  void setValue(int no)
  {
    this.no=no;
  }
  void getFact()
  {
    for(int i=1;i<=no;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial is:"+fact);
  }
}
public class FactApp
{
   public static void main(String []x)
   {
       int no;
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter No:");
       no=xyz.nextInt();
       Fact f=new Fact();
       f.setValue(no);
       f.getFact();
    }
} 
       
       
      
