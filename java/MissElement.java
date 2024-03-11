import java.util.*;
public class MissElement
{
  public static void main(String x[])
  { 
    int i,j,diff;
    int a[]=new int[5];
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Values In Array");
    for(i=0;i<5;i++)
    {
      a[i]=xyz.nextInt();
    }
    for(i=0;i<a.length-1;i++)
    { 
      diff=a[i+1]-a[i];
      if(diff>1)
      {
        for(j=a[i];j<(a[i+1]-1);)
        {
          System.out.printf("%d\t",++j);
        }
      }
    }
  }
}      
      
    
    
    