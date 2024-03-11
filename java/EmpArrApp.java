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
public class EmpArrApp
{
  public static void main(String []x)
  {
    Employee e[]=new Employee[2];
    for(int i=0;i<e.length;i++)
    {
       e[i]=new Employee();
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter Id Name And Sal :");
       String name=xyz.nextLine();
       int id=xyz.nextInt();
       int sal=xyz.nextInt();
       e[i].setName(name);
       e[i].setId(id);
      
       e[i].setSal(sal);
     }
      System.out.println("Display All Employee Data\n");
      
      for(int i=0;i<e.length;i++)
      {
        System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
      }
    }
}
      
    
    














