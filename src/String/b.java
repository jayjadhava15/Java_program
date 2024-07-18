package String;

public class b {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		//legth()
		System.out.println(s1.length());//8
		System.out.println(s2.length());//8
		System.out.println(s3.length());//4
		//touppercase()
		System.out.println(s1.toUpperCase());
		//tolowercase
		System.out.println(s2.toLowerCase());
		//equals()
		System.out.println(s1.equals(s2));//false
		//equalignorecase()
		System.out.println(s1.equalsIgnoreCase(s2));//true
		//contains()
		System.out.println(s1.contains(s3));//true
		
		//charAt()
		System.out.println(s1.charAt(3));
		//indexOf()
		System.out.println(s1.indexOf('o'));
		//startswith()
		System.out.println(s1.startsWith("velo"));//false
		//endswith()
		System.out.println(s1.endsWith("city"));
		//substring()
		System.out.println(s1.substring(4));
		//concat()
		System.out.println(s1.concat(s3));//
		//replace()
		System.out.println(s1.replace("velo","Telo"));
		
	}
}
