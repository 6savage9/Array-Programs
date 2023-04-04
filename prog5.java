package arrayPrograms;

public class prog5 {

	public static void main(String[] args) {
		
		int []a= {1,2,-3,4,-5,6};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int countPositive=0;
		int countNegative=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>=0) {
				countPositive++;
			}
			else
				countNegative++;
			
		}
		
		System.out.println("Positive: ");
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>=0) {
				System.out.println(a[i]);
			}
			
			// 1a 2c 3b 4d
			
		}
		
		System.out.println("Negative: ");
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<0) {
				System.out.println(a[i]);
			}
			
			
		}
		
		System.out.println("Positive "+countPositive);
		System.out.println("Negative "+countNegative);
		
		
		
	}
}
