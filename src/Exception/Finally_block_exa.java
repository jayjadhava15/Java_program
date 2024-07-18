package Exception;

public class Finally_block_exa {
	public static void main(String[] args) {
		System.out.println("hii");
		int a=12;
		int b=0;
		try {
		System.out.println(a/b);//devide by zero
		
	}
		catch(ArithmeticException z) {
			System.out.println(" enter valid denomenator");
		}
		finally {
			System.out.println("Thank you for using ATM");//always it will execute irrespective of try and catch block
		}

	}
}
