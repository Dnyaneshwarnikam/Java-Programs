import java.util.*;
class Square
{ int no;
   
   Square(int no)
  { 
     this.no=no;
  }
   int getSquare()
  {
     return no*no;
  } 
}
public class ParamConsSquare
{
   public static void main(String []x)
   {  
      int no;
      
     
      
      Square s=new Square(5);
      int result=s.getSquare(); 
      System.out.println("Square is:"+result);
   }
}  
