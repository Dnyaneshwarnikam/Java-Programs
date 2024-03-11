import java.util.*;
class Student
{
   int a[];
   int per,i;
   void setSubMarks(int s[])
  {
      a=s;
  }
  void calculatorPer()
  {
     int agg=0;
     for(i=0;i<6;i++)
     {
       agg=agg+a[i];
     }
     per=agg/6;
     System.out.println("Percentage :"+per);
  }
  void checkGrades()
  {
     if(per>75&&per<=100)
     {
       System.out.println("Student in Distinction");
     }
     else if(per>60&&per<=75)
     {
       System.out.println("First division"); 
     }
     else if(per>=50&&per<=60)
     {
       System.out.println("Second division");
     }
     else
     {
      System.out.println("Student failed ");
     }
   }
}
public class StudentApp
{
   public static void main(String x[])
   {
     int i;
     int a[]=new int[6];
     Scanner xyz=new Scanner(System.in);
     System.out.println("Enter Values:");
     for(i=0;i<6;i++)
     {
      a[i]=xyz.nextInt();
     }
     Student s=new Student();
     s.setSubMarks(a);
     s.calculatorPer();
     s.checkGrades();
   }
}



 
     
