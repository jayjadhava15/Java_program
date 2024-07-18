package nested_for_loop;

public class star4 {
	public static void main(String[] args) {
		for (int i=1;i<=3;i++) {
			for (int j=1;j<=4;j++) {
				if (i==1||i==3||j==1||j==4) {
					System.out.print("*");
				}
				else {System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
