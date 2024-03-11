import java.util.*;
class getTable
{
  int no;
  void setValue(int no)
  {
    this.no=no;
  }
  void showTable()
 { 
   int i;
   for(i=1;i<=10;i++)
   {
      System.out.printf("%d\n",no*i);
   }
 }
}
public class Table
{
  public static void main(String x[])
  {
    int no;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter No");
    no=xyz.nextInt();
    getTable t1=new getTable();
    t1.setValue(no);
    t1.showTable();
  }
}
  