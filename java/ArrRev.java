import java.util.*;
public class ArrRev
{
  public static void main(String x[])
  {
    int i,mid;
    int a[]=new int[5];
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Values Ii Array :");
    for(i=0;i<5;i++)
    {
     a[i]=xyz.nextInt();
    }
    mid=a.length/2;
    end=a.length-1;
    for(i=0;i<mid;i++)
    { 
       temp=a[i];
    
    