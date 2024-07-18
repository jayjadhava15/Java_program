package nested_for_loop;

public class Star5 {
	public static void main(String[] args) {
		int star=1;//no of stars in 1st row is only one
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}//close the inner for loop
			System.out.println();
			star++;
			
		}
	}
}
