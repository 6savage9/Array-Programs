package arrayPrograms;

import java.util.TreeSet;

public class prog2_2 {

	//Design a method to merge two sorted array in the sorted form.
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int []b= {11,12,6};
		
		m1(a,b);
		
	}
	
	public static void m1(int []a, int []b) {
		
		
		int []c=new int [a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			
			c[i]=a[i];
		}
		
		int m=0;
		
		for(int i=a.length; i<c.length; i++) {
	
			c[i]=b[m];
			m++;
		}
		
		System.out.println("Before Sort");
		for(int i=0; i<c.length; i++) {
			
			System.out.print(c[i]+" ");
		}
		
		System.out.println();
		
		TreeSet t=new TreeSet();
		
		System.out.println("After Sort");
		
		for(int i=0; i<c.length; i++) {
			
			t.add(c[i]);
			
		}
		
		System.out.println(t);
		
		
	}
}
