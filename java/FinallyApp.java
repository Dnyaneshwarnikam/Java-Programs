import java.util.*;
public class FinallyApp {
public static void main(String x[])
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	try {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.printf("Division is %d",c);
	}
	finally {
		System.out.println(" I Can Always Execute");
	}
}
}
