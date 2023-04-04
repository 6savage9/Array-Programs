package arrayPrograms;

public class prog12_2 {

	public static void main(String[] args) {
		
		int[]a= {15, 123, 14, 12345, 123432};
		m1(a);
	}
	
	public static void m1(int[]a) {
		
		int m=a[0];
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<m)
				m=a[i];
			
		}
		System.out.println("Smallest element: "+m);
		
		int n=a[0];
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=m) {
				if(a[i]>m) {
					if(a[i]<n) {
						n=a[i];
					}
				}

			}
			
		}
		
		System.out.println("Second smallest: "+n);
		
		
		
	}
}
