package conditional_Statement;

public class Examination {
	public static void main(String[] args) {
		int marks=66 ;
		if(marks>=65) {
			System.out.println("passes in Distinction");
		}
		else if(marks>=60) {
			System.out.println("passed in 1 st class");
			
		}
		else if(marks>=50) {
			System.out.println("passed in 2nd class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("Successfully FAIL");
		}
	}

}
