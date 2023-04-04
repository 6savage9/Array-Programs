package arrayPrograms;

public class prog13_2 {

	//Desing a method to Find Smallest Number in an array
	public static void main(String[] args) {
		
		int[]a= {2,4,2,6,7,9,5};
		m1(a);
	}
	
	public static void m1(int[]a) {
		
		int m=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<m) {
				m=a[i];
			}
		}
		
		System.out.println(m);
	}
	
}
