public class Duck
{
   public static void main(String x[])
  {
    int i,no=1444,rem,flag=0;
    while(no!=0)
    {
      rem=no%10;
      no=no/10;
      if(rem==0)
      {
         flag=1;
         break;
      }
    }
   if(flag==1)
   {
     System.out.println("Number Is Duck");
   }
   else
   {
    System.out.println("Number Is Not Duck");
   }
  }
} 
