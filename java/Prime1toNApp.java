import java.util.*;
public class Prime1toNApp
{
public static void main(String x[])
{
  int i,j,flag,no;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter No:");
  no=sc.nextInt();
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



       
 
  