import java.util.*;
class Vbank
{
  private int id;
  private String name;
  private int age;
  
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
  public void setAge(int age)
  {
     this.age=age;
  }
  public int getAge()
  {
     return age;
  }
}
class Voter
{
  private Vbank vb[];
  public void setVoter(Vbank vb[])
  {
    this.vb=vb;
  }
  public Vbank getVoter(int i)
  {  
   
   if(vb[i].getAge()>18)
   {
      return vb[i];
   }
   else
   {
      return null;
   }
 }
}
public class VoterApp
{
   public static void main(String x[])
   { 
     Voter v=new Voter();
     Vbank v1[]=new Vbank[3];
     
     for(int i=0;i<v1.length;i++)
     { 
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter Name Id And Age :");
       v1[i] =new Vbank();
       String name=xyz.nextLine();
       int id=xyz.nextInt();
       int age=xyz.nextInt();
       v1[i].setName(name);
       v1[i].setId(id);
       v1[i].setAge(age);
     }
   v.setVoter(v1);
   for(int i=0;i<v1.length;i++)
   {
     Vbank v2=v.getVoter(i);
     if(v2!=null)
     {
       System.out.println(v2.getId()+"\t"+v2.getName()+"\t"+v2.getAge());
     }
   }
 }
}
 
       
       
       
       
      
        

    
     
  
  
  

