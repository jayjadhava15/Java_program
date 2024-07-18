package Arrays;

public class Array {
	public static void main(String[] args) {
		int [] i=new int [5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		//System.out.println(i[0]);
		//System.out.println(i[1]);
		//print entire data
		for(int j=0;j<=4;j++) {
			System.out.println(i[j]);
			//AIOOBE
			System.out.println(i[6]);//data is not there but u r tying to fetch hence it results in AIOOBE
		}
	}
}
