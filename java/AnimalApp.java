import java.util.*;
class Animal{
     public void eat(){
       System.out.println("Animal is eat");
     }

     public void sleep(){
       System.out.println("Animal is sleep");
     }
}
class Dog extends Animal{
   
     public void bark(){
       System.out.println("Bark");
     }
     
     public void bread(){
       System.out.println("Breed");
     }
}
public class AnimalApp{
  public static void main(String x[]){
   
   Dog d1= new Dog();
   d1.eat();
   d1.sleep();
   d1.bark();
   d1.bread();
 }
}
     
     