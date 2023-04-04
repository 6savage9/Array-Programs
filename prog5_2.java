package arrayPrograms;

public class prog5_2 {

	//Design a method to find the first and second smallest element of the array.
	
	public static void main(String[] args) {
		
		int []a= {18, 12, 32, 45, 2};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int x=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<x) {
				x=a[i];
			}
		}
		
		System.out.println("smallest Element: "+x);
		
		int y=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>x) {
				
				if(a[i]<y) {
					y=a[i];
				}
				
			}
			
		}
		
		System.out.println(y);
		
	}
}
