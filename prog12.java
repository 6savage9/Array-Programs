package arrayPrograms;

public class prog12 {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int []m=new int [a.length];
		for(int i=0; i<a.length; i++) {
			
			m[i]=a[i];
			
		}
		
		for(int i=0; i<m.length; i++) {
			
			System.out.print(m[i]+" ");
		}
		
		
	}
}
