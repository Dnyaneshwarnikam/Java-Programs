import java.util.*;
class UserDefinedExp extends ClassNotFoundException
{
	String message() {
		return "I am UserException";
	}
	
}
class Voter{
    void check(int voter) throws UserDefinedExp{
     
           if(voter<18)
           {
              throw new UserDefinedExp();
           }
           else
           {
               System.out.println("Voter Eligible For Voting");
           }      
    }
    
}
class Employee{
    void check(int age) throws UserDefinedExp{
         if(age<21)
          {
               throw new UserDefinedExp();
          } 
          else
           {
               System.out.println("Employee Eligible");
           }   
    }
}
class NoOdd{
    void check(int no) throws UserDefinedExp{
         if(no%2==0)
          {
               throw new UserDefinedExp();
          } 
          else
           {
               System.out.println("No Is Odd");
           } 
   }
}

class ArrNoDuplicate{
   public void checkValue(int arr[])throws UserDefinedExp{
      boolean flag=true;
      for(int i=0;i<arr.length;i++)
       {
          for(int j=i+1;j<arr.length-1;j++)
          {
               if(arr[i]==arr[j])
               {
                  throw new UserDefinedExp();
               }
          }
       }
       if(flag)
        System.out.println("in Array Duplicate Value Not Present");
  }
}
                
public class UserDefiExApp{
  public static void main(String x[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your choice");
     int choice=sc.nextInt();
     switch(choice){
     case 1:
             Voter v=new Voter();
              try{
              v.check(17);
   
              }catch(UserDefinedExp e){
              System.out.println("Error is:"+e);
              } 
         break;
     case 2:
          
           Employee e=new Employee();
            try{
                  e.check(20);
            }catch(UserDefinedExp r){
              System.out.println("Error is :"+r);
            }
          break;
     case 3:
            NoOdd o=new NoOdd();
            try{
                  o.check(22);
            }catch(UserDefinedExp s){
              System.out.println("Error is:"+s);
            }
          break;
     case 4:
          try{
          int arr1[]=new int[4];
          int i;
          System.out.println("Enter Values:");

          for(i=0;i<arr1.length;i++)
          {
                arr1[i]=sc.nextInt();
          }
           ArrNoDuplicate a1=new ArrNoDuplicate();
           a1.checkValue(arr1);
           }catch(UserDefinedExp ex){
              System.out.println("Error is:"+ex);
            }
          break;
 
                   
    }
         
  }
}        