package arrayPrograms;

public class prog10_2 {
	
	//Desing a method to Find 2nd Largest Number in an array

	public static void main(String[] args) {
		
		int[]a= {73167, 78, 327, 657583, 77, 9128};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int m=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>m) {
				m=a[i];
			}
			
		}
		System.out.println("Largest Number: "+m);
		
		int n=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<m) {
				
				if(a[i]>n) {
					n=a[i];
				}
			}
		}
		
		System.out.println("Secong Largest Number: "+n);
		
	}
}
