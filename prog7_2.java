package arrayPrograms;

import java.util.TreeSet;

public class prog7_2 {

	//Design a method to sort the elements of an array in ascending order

	public static void main(String[] args) {
		
		int[]a= {11, 123, 23, 54, 342};
		
		m1(a);
	}
	
	public static void m1(int []a) {
		
		TreeSet t=new TreeSet();
		
		for(int i=0; i<a.length; i++) {
			t.add(a[i]);
		}
		
		System.out.println(t);
		
	}
}
