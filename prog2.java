package arrayPrograms;

public class prog2 {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int sum=0;
		int avg=1;
		
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];
			
		}
		
		System.out.println((sum)/a.length);
		
	}
}
