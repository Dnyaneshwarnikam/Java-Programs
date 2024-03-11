import java.util.Scanner; 
public class Prime
{
     public static void main(String x[])
     {
        int no,i,flag=1;
        System.out.println("Enter No");
        Scanner scanner = new Scanner(System.in);
        no=scanner.nextInt();
        scanner.close();
        i=2; 
        while(i<no)
        { 
           if(no%i==0)
           {
             flag=0;
             break;
           }
           i++;
        }
        if(flag==1)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
     }
}     
         