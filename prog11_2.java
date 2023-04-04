package arrayPrograms;

public class prog11_2 {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,321,384,32,12, 24};
		m1(a);
		
	}
	
	public static void m1(int []a) {
		
		int x=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>x)
				x=a[i];
			
		}
		
		System.out.println(x);
	}
}
