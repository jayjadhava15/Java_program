package nested_for_loop;

public class Star2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1&&j==1) {
					System.out.print("@");
				}
				else {
					System.out.print("*");
				}
				
			}//close inner block
			System.out.println();
		}
	}
	
}
