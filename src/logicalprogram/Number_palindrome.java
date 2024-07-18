package logicalprogram;

public class Number_palindrome {
	public static void main(String[] args) {
		int num=212;
		int rev=0;
		for(int i=num;i>0;i=i/10) {
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		if(num==rev) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("Given number is not pallindrome");
		}
	}
}
