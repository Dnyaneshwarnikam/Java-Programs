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
   public void setRun(int run)
   {
     this.run=run;
   }
   public int getRun()
   {
     return run;
   }
}
public class PlayerPojo
{
   public static void main(String x[])
   {
     Player p1=new Player();
     p1.setId(1);
     p1.setName("Dnyanuu");
     p1.setRun(100);
     System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
    }
}
     
     




      
   