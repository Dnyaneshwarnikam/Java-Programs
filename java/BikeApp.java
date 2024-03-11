import java.util.*;
class Bikes
{
  private int id;
  private String name;
  private int prise;
  
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
  public void setPrise(int prise)
  {
    this.prise=prise;
  }
  public int getPrise()
  {
    return prise;
  }
}
class Company
{
   private Bikes b1[];
   public void setBikes(Bikes b1[])
   {
     this.b1=b1;
   }
   public Bikes getBikes(int id)
   {
      boolean flag=false;
      int i;
      for(i=0;i<b1.length;i++)
      { 
        if(b1[i].getId()==id)
        {
            flag=true;
             break;
        }
      }
     if(flag)
     {
       return b1[i];
     }
     else
     {
       return null;
     }
   }
}
public class BikeApp
{
   public static void main(String []x)
   {
      
      Company c1=new Company();
      Bikes   b1[]=new Bikes[2];
      Scanner abc=new Scanner(System.in);
      for(int i=0;i<b1.length;i++)
      {     
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter Name Id And Price:");
        String name=xyz.nextLine();
        int id=xyz.nextInt();
        int prise=xyz.nextInt();
        b1[i]=new Bikes();
        b1[i].setName(name);
        b1[i].setId(id);
        b1[i].setPrise(prise);
      }
      c1.setBikes(b1);
      System.out.println("Enter Bike Id For Search:");
      int bid=abc.nextInt();
      Bikes b2=c1.getBikes(bid);
      if(b2!=null)
       {
           System.out.println("Product found with following details");
           System.out.println(b2.getId()+"\t"+b2.getName()+"\t"+b2.getPrise());
       }
       else 
       {
          System.out.println("Bike not found");
       }
    }
}
  
   














 
  