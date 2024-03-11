import java.util.*;
public class freqencyApp{
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter No");
     int no=xyz.nextInt();
     for(int i=0;i<=no;i++)
     {
      int temp=no;
      int count=0;
      while(temp!=0)
      {
         int rem=temp%10;
         if(rem==i)
         {
           count++;
         }
         temp=temp/10;
      }
       if(count!=0)
       {
         System.out.printf("%d--->%d time\n",i,count);
       }
     }
  }
}
