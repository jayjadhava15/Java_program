package Exception;

public class Number_format_exc {
	public static void main(String[] args) {
		try {
		System.out.println(Integer.parseInt("2K3"));
	}
		catch(NumberFormatException donky) {
			System.out.println("Idiot do not write characters there");
		}
		System.out.println("Boss exception is handled");
	}
	
}
