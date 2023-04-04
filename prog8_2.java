package arrayPrograms;

import java.util.TreeSet;

public class prog8_2 {
	
	//Design a method to sort the elements of an array in descending order

	public static void main(String[] args) {
		
		int[]a= {327, 437, 213, 787, 654, 111};
		
		m1(a);
	}
	
	public static void m1(int []a) {
		
		TreeSet t=new TreeSet();
		
		for(int i=0; i<a.length; i++) {
			t.add(a[i]);
		}
		
		//System.out.println(t);
		
		int []x=new int[a.length];
		int size=0;
		
		for(int i=a.length-1; i>=0; i--) {
			
			x[size++]=a[i];
			
		}
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
