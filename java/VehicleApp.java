import java.util.*;
class Vehicle{
   String color="Black";
   String model ="TATA";
   int year=2024;
}
class Car extends Vehicle{
   
  int numDoors=4;
  
  public void displayInfo(){
   
    System.out.printf("%s\n%s\n%d\n%d",color,model,year,numDoors);
  }
}
public class VehicleApp
{
  public static void main(String x[])
 {  
     Car c1=new Car();
     c1.displayInfo();
  }
}


   
  