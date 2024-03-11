import java.util.*;
class Employee{
   private int id;
   private String name;
   private String designation;
   private int salary;
   
   public void setId(int id){
       this.id=id;
   }
   public int getId(){
       return id;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
   public void setDesignation(String designation){
       this.designation=designation;
   }
   public String getDesignation(){
       return designation;
   }
   public void setSalary(int salary){
       this.salary=salary;
   }
   public int getSalary(){
       return salary;
   }
}
class Company{
     private Employee emp[];
  
    Company(Employee emp[]){
          this.emp=emp;
    }
    public void sortEmployee(){
     Employee temp=null;
     for(int i=0;i<emp.length;i++)
        {
           for(int j=i+1;j<emp.length;j++)
           {
             if(emp[i].getSalary()<emp[j].getSalary())
              {
                   temp=emp[i];
                   emp[i]=emp[j];
                   emp[j]=temp;
              }
           }
        }
        System.out.println("After sort employees salary wise:");
        for(int i=0;i<emp.length;i++)
        {
System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getDesignation()+"\t"+emp[i].getSalary());
}
}
}
public class CompanyApp{
  public static void main(String x[]){
      
      Employee e1[]=new Employee[4];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<e1.length;i++)
      {
         System.out.println("Enter Employee Name,Designation,ID and Salary:");
         
         String name=sc.nextLine();
         String designation=sc.nextLine();
         int id=sc.nextInt();
         int salary=sc.nextInt();
         sc.nextLine();
         e1[i]=new Employee();
         e1[i].setId(id);
         e1[i].setName(name);
         e1[i].setDesignation(designation);
         e1[i].setSalary(salary);
      }
      Company c=new Company(e1);
      c.sortEmployee();
  }
}
     
            
     
       
    
    





















   
   
   
