package arrayPrograms;

public class prog8 {

	public static void main(String[] args) {
		
		int []a= {1, 312, 4321, 213, 32};
		m1(a);
	}
	
	public static void m1(int[]a) {
		
		int leng=0;
		
		for(int i=0; i<a.length; i++) {
			
			String m=String.valueOf(a[i]);
			
			
			int x=m.length();
			leng=leng+x;
			
		}
		
		System.out.println(leng);
		
	}
}
