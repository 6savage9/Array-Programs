package arrayPrograms;

public class prog6_2 {

	//Design a method to reverse the elements of the array.
	
	public static void main(String[] args) {
		
		int[]a= {11, 23, 234, 654, 34};
		m1(a);
	}
	
	public static void m1(int[]a) {
		
		int []c=new int[a.length];
		
		int size=0;
				
		for(int i=a.length-1; i>=0; i--) {
			
			
			c[size++]=a[i];
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
	}
}
