package arrayPrograms;

public class prog3 {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
}
