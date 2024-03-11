import java.util.*;
class AddAmount{
	int amount=50;
	
        public AddAmount()
	{
        }
	public AddAmount(int add) {
		this.amount=50+add;
	}
}
public class AddAmountApp {
public static void main(String[] args) {
	AddAmount a1=new AddAmount(25);
	
	System.out.println("Final Amount :"+a1.amount);
	
	
}
}