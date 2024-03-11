import java.util.Scanner;
public class Perfect
{
    public static void main(String x[])
    {
      int no,i,sum=0;
      System.out.println("Enter No");
      Scanner scanner = new Scanner(System.in);
      no=scanner.nextInt();
      scanner.close();
      i=1;
      while(i<no)
      {
        if(no%i==0)
        {
          sum=sum+i;
        }
       i++;
      }
      if(no==sum)
      System.out.println("Number is Perfect");
      else
      System.out.println("Number Is Not Perfect");
    }
}