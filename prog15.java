package arrayPrograms;

public class prog15 {
	
	//smallest element in Array

	public static void main(String[] args) {
		
		int []a={11,222,32,4,5};
		
		m1(a);
		
	}
	
	public static void m1(int []a) {
		
		int x=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<x) {
				x=a[i];
			}
			
		}
		
		System.out.println(x);
		
	}
}

