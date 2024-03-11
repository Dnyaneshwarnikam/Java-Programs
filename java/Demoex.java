import java.util.*;
public class Demoex {
public static void main(String []x)
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two No:");
	a=sc.nextInt();
	b=sc.nextInt();
	try {
		c=a/b;
		System.out.printf("Division is %d\n",c);
	}
	catch(ArithmeticException ex){
		System.out.printf("Error is "+ex);
		System.out.printf("Avoid Second Value as Zero\n");
	}
	System.out.println("Logic1");
	System.out.println("Logic2");
	System.out.println("Logic3");
}
}
