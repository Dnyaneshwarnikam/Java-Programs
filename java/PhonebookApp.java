import java.util.*;
class Phonebook
{
  private int id;
  private String name;
  private String email;
  private int contact;
  private String address;
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
  public void setEmail(String email)
  {
     this.email=email;
  }
  public String getEmail()
  {
     return email;
  }
  public void setContact(int contact)
  {
     this.contact=contact;
  }
  public int getContact()
  {
     return contact;
  }
  public void setAddress(String address)
  {
     this.address=address;
  }
  public String getAddress()
  {
     return address;
  }
}
public class PhonebookApp
{
   public static void main(String []x)
   {
      ArrayList al=new ArrayList();
      Object obj=new Object();
      do{
          int choice;
          System.out.println("1:Create New Contact");
          System.out.println("2:View All Contact");
          System.out.println("3:Search Contact by id");
          System.out.println("4:Delete contact by using id");
          System.out.println("5:Count the Contact Whose name as same");
          System.out.println("6:count the contact start with  90 ,91 ,97, 95 ,86,87");
          System.out.println("7:Count the contact whose address contain PUNE,NASHIK ");
          System.out.println("8:Update Contact by email or id");
          Scanner xyz=new Scanner(System.in);
          choice= xyz.nextInt();
          switch(choice)
          {
             case 1:
                  System.out.println("Enter Contact Detail: Name,Email,Address,Id,Contact");
                  xyz.nextLine();
                  String name=xyz.nextLine();
                  String email=xyz.nextLine();
                  String address=xyz.nextLine();
                  int    id=xyz.nextInt();
                  int    contact=xyz.nextInt();
                  Phonebook p=new Phonebook();
                  p.setId(id);
                  p.setContact(contact);
                  p.setAddress(address);
                  p.setName(name);
                  p.setEmail(email);
                  al.add(p);
                  break;
           
             case 2:
             break;
             case 3:
             break;
             case 4:
             break;
             case 5:
             break;
             case 6:
             break;
             case 7:
             break;
             case 8:
             break;
             default:
               System.out.println("wrong choice");
               }
             }while(true);
    }
}
                  
           





