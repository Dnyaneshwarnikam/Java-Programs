import java.util.*;
public class PrimeApp
{
   public static void main(String []x)
   {
       int no,i,flag=1;
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter No");
       no=xyz.nextInt();
       for(i=2;i<no;i++)
       {
          if(no%i==0)
          {
             flag=0;
             break;
          }
       }
       if(flag==1)
       {
         System.out.println("prime no");
       }
       else
       {
         System.out.println("Not prime");
       }
    }
}