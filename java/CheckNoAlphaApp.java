import java.util.*;
public class CheckNoAlphaApp
{
  public static void main(String x[])
  {
     char ch;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Character:");
     ch=sc.nextLine().charAt(0);
     if(ch>='1' && ch<='9')
     {
      System.out.println("Number");
     }
     else if(ch>='a' && ch<='z')
     {
       System.out.println("Character");
     }
     else
     {
       System.out.println("Special Symbol");
     }
   }
}            
