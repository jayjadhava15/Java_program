package logicalprogram;

public class String_Palindrome {
	public static void main(String[] args) {
		String org="refer";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);//madam


		if(rev.equals(org)) {
			System.out.println("Given string is pallindrome");
		}
		else {
			System.out.println("Given string is not the palindrome");
		}
	}

}
