import java.util.*;
class Employee
{
   String name;
   int id;
   int basicsal;
   int jr,totalsal;
   void setPersonalInfor(String name,int id,int basicsal)
   {
     this.name=name;
     this.id=id;
     this.basicsal=basicsal;
   }
   void setProgressPer()
   {
      jr=basicsal*30/100;
      totalsal=basicsal+jr;
   }
   void show()
   {
     System.out.printf("EmpName :%s\nEmpId :%d\nEmpBasicSal :%d\n",name,id,basicsal);
     System.out.printf("Incremental Sal :%d\nTotal Sal :%d",jr,totalsal);
   }
}
public class EmpData
{
  public static void main(String x[])
  {
    String name;
    int id,sal;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Name Id And Sal :");
    name=xyz.nextLine();
    id=xyz.nextInt();
    sal=xyz.nextInt();
    Employee e=new Employee();
    e.setPersonalInfor(name,id,sal);
    e.setProgressPer();
    e.show();
  }
}
      






