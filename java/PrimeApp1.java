import java.util.*;
public class PrimeApp1
{
  public static void main(String []x)
  {
     int i,j,no,flag;
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter No :");
     no=xyz.nextInt();
     for(i=2;i<no;i++)
     {
         flag=1;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
               flag=0;
               break;
            }
        }
        if(flag==1)
        {
           System.out.println("\t"+i);
        }
     }
   }
}
     