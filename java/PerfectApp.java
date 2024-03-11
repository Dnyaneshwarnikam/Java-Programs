import java.util.*;
public class PerfectApp
{
   public static void main(String []x)
   {
        int i,j,no,sum;
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter No");
        no=xyz.nextInt();
        for(i=1;i<no;i++)
        { 
           sum=0;
           for(j=1;j<i;j++)
           {
              if(i%j==0)
              {
                sum=sum+j;
              }
           }
           if(sum==i)
           {
             System.out.println("\t"+i);
           }
        }
     }
}