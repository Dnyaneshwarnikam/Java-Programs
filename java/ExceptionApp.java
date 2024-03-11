import java.util.*;
public class ExceptionApp {
	static int s[];
public static void main(String[] args) throws ClassNotFoundException {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Your Choice :");
	int choice = sc.nextInt();
	try {
	switch(choice) {
	case 1:
		int a=0,b=9,c;
		c=b/a;
		System.out.println(c);
		
		break;
	case 2:
		int arr[]=new int[5];
		System.out.println(arr[5]);
		break;
	case 3:
		System.out.println("%d"+s[2]);
		break;
	case 4:
		Class.forName("Test");
		break;
	case 5:
		String x="abcd";
		int m= Integer.parseInt(x);
		break;
	case 6:
		int m1;
		System.out.println("Enter char:");
		m1=sc.nextInt();
		break;
		default:
			System.out.println("Wrong choice");
	}
	}catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException ex) {
		
		System.out.println("Error is:"+ex);
	}
}
}
