package Collections;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Ganesh");
		al.add(100);
		al.add('A');
		al.add(null);
		//print entire data
		System.out.println(al);
		//get the size
		System.out.println(al.size());
		//empty checking
		System.out.println(al.isEmpty());//false
		//containing data or not
		System.out.println(al.contains(200));//true
		//get data from particular index
		System.out.println(al.get(0));

	}
}
