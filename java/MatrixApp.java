import java.util.*;
public class MatrixApp
{
  public static void main(String x[])
  {
     int i,j;
     int a[][]=new int[2][2];
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Array values:");
     for(i=0;i<2;i++)
     {
        for(j=0;j<2;j++)
        {
          a[i][j]=xyz.nextInt();
        }
     }
     for(i=0;i<2;i++)
     {
        for(j=0;j<2;j++)
        {
          System.out.print(a[i][j]);
        }
        System.out.println();
     }
   }
}
     
  