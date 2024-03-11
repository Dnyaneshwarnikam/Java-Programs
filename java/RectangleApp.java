import java.util.*;
class Rectangle{
	private float length;
	private float breadth;
	
	
	public Rectangle(){
		this.length=0;
		this.breadth=0;
	
	}
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int no) {
		this.length=no;
		this.breadth=no;
	}
	public float calculate() {
		return length*breadth;
	}
}
public class RectangleApp {
public static void main(String[] args) {
	Rectangle r1=new Rectangle();
	Rectangle r2=new Rectangle(4,7);
	Rectangle r3=new Rectangle(5);
	float result=r1.calculate();
	float result1=r2.calculate();
	float result2=r3.calculate();
	System.out.printf("Area is:%f\n%f\n%f",result,result1,result2);
	
	
	
}
}