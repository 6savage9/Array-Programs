package arrayPrograms;

public class prog9 {

	public static void main(String[] args) {
		
		int []a= {2100, 120, 234, 432, 2, 1200};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%3==0 && a[i]%4==0 && a[i]%5==0) {
				
				count++;
				
			}
			
		}
		System.out.println(count);
		
	}
}
