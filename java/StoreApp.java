import java.util.*;
class Product
{
   private int id;
   private String name;
   private int price;
   
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
   public void setPrice(int price)
   {
     this.price=price;
   }
   public int getPrice()
   {
     return price;
   }
}
class Store
{
   private Product p[];
   public void setProduct(Product ...p)
   {
      this.p = p;
   }
   public void show()
   {
     for(int i=0;i<p.length;i++)
     {
        System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
     }
   }
}
public class StoreApp
{
   public static void main(String []x)
   {
      Product p1 = new Product();
      p1.setId(1);
      p1.setName("Trimax");
      p1.setPrice(50);
      
      Product p2 = new Product();
      p2.setId(1);
      p2.setName("Staylo");
      p2.setPrice(7);
      
      Product p3 = new Product();
      p3.setId(1);
      p3.setName("Pentonic");
      p3.setPrice(10);
      
      Store t1 = new Store();
      t1.setProduct(p1,p2,p3);
      t1.show();
    }
}
       

       











       
