import java.util.*;
class Player
{
   private int id; 
   private String name;
   private int run;
   public void setId(int id)
   {
    this.id=id;
   }
    public int getId();
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
   public void setRun(int run)
   {
     this.run=run;
   }
   public int getRun()
   {
     return run;
   }
}
public class StudentPojo
{
   public static void main(String x[])
   {
     Student s1=new Student();
     s1.setId(1);
     s1.setName("Dnyanuu");
     s1.setRun(100);
     System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getRun());
    }
}
     
     




      
   