import java.util.*;
class Perfect
{
    private int no,i,j,sum; 
    
     void setData(int no)
     {
        this.no=no;
     }
     void Display()
     {
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
          System.out.println("\t"+i);
        }
      }
}
public class PerfectNo
{
   public static void main(String []x)
   {
      int no;
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter No:");
      no=xyz.nextInt();
      Perfect p=new Perfect();
      p.setData(no);
      p.Display();
    }
}
      









    