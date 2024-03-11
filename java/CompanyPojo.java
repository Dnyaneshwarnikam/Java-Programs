import java.util.*;
class Employee
{
  private int id;
  private String name;
  private int sal;
  public void setId(int id)
  {
    this.id=id;
  }
  public int getId()
  {
    return id;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return name;
  }
  public void setSal(int sal)
  {
    this.sal=sal;
  }
  public int getSal()
  {
    return sal;
  }
}
class Company
{
   private Employee employee;
   void setEmployee(Employee employee)
   {
     this.employee=employee;
   }
   void showDetail()
   {
      String name=employee.getName();
      int    id=employee.getId();
      int    sal=employee.getSal();
      System.out.printf("%s\t%d\t%d",name,id,sal);
   }
}
public class CompanyPojo
{
   public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Name Id and Sal:");
     String name=xyz.nextLine();
     int    id=xyz.nextInt();
     int    sal=xyz.nextInt();
     Employee e=new Employee();
     e.setName(name);
     e.setId(id);
     e.setSal(sal);
     Company c=new Company();
     c.setEmployee(e);
     c.showDetail();
   }
}
      

 









  
   