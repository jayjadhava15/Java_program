package Exception;

public class Airthmatic_exc_Handling {
	public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
	int c=a/b;//risky code(it is the code by which exception is created)
	}
	catch(ArithmeticException anky) {
		System.out.println("Idiot enter valid denomenator");
	}
	System.out.println("hi");

}
}
