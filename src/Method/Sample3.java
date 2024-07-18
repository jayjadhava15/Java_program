package Method;	//non-static call from same class

	public class Sample3 {//ULC
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		s.m4();//method calling statement
		s.m3();//method calling statement
		
		
	}
	public void m3() {
		System.out.println("running from same class and m3");
	}
	public void m4() {
		System.out.println("running from same class m4");
	}
}
