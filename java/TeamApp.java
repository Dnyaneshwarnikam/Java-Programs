import java.util.*;
class Players
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
class Team
{
   private Players p1[];
   public void setPlayers(Players ...p1)
   { 
      this.p1 = p1;
   }
   public void show()
   {
     for(int i=0;i<p1.length;i++)
     {
        System.out.println(p1[i].getId()+"\t"+p1[i].getName()+"\t"+p1[i].getRun());
     }
   }
}
public class TeamApp
{
   public static void main(String []x)
   {  
     Players p = new Players();
     p.setId(1);
     p.setName("K L Rahul");
     p.setRun(90);

     Players p2 = new Players();
     p2.setId(18);
     p2.setName("Kohli");
     p2.setRun(85);

     Players p3 = new Players();
     p3.setId(33);
     p3.setName("Hardik");
     p3.setRun(11);

     Team t = new Team();
     t.setPlayers(p,p2,p3);
     t.show();
   }
}
          
   










