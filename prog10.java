package arrayPrograms;

public class prog10 {

	public static void main(String[] args) {
		
		String []a= {"abccba", "asbdhb", "jhsdagyu", "hello", "abba", "kijjik"};
		m1(a);
	}
	
	public static void m1(String[]a) {
		
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			
			String x=a[i];
		//	System.out.println(x);
		//	System.out.println(x.length());
			
			String []y=x.split("");
			String m="";
		
			for(int j=y.length-1; j>=0; j--) {
				
				m=m+y[j];
				
			}
			
			//System.out.println(m);
			
			if(x.equals(m)) {
				count++;
			}
			
			
		}
		
		System.out.println("No. of Palindrome: "+ count);
		
	}
}
