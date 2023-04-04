package arrayPrograms;

public class prog11 {

	public static void main(String[] args) {
		
		int []a= {123, 321, 421, 2, 43, 6, 28};
		m1(a);
	}
	
	public static void m1(int[] a) {
		
		for(int i=0; i<a.length; i++) {
			
			int m=a[i];
			int sum=0;
			
			for(int j=1; j<m; j++) {
				
				if(m%j==0) {
					sum=sum+j;
				}
				
			}
			
			if(sum==a[i]) {
				System.out.println(a[i]);
			}
			
		}
		
	}
}
