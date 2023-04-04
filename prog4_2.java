package arrayPrograms;

public class prog4_2 {

	//Design a method to calculate the sum and average of the even element of the array.

	public static void main(String[] args) {
		
		int []a= {10, 14, 15, 16, 20, 11, 55};
		m1(a);
		
		
	}
	
	public static void m1(int []a) {
		
		int sum=0;
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				sum=sum+a[i];
				count++;
			}
			
		}
		
		System.out.println("Sum of Even Number: "+sum);
		
		int avg=sum/count;
		
		System.out.println("Avg of Even Numbers: "+avg);
		
	}
}
