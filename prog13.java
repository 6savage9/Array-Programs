package arrayPrograms;

public class prog13 {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		int []b= {8,9,7};
		m1(a,b);
	}

	public static void m1(int []a, int []b) {
		
		int []m=new int[a.length+b.length];
		
		
		for(int i=0; i<a.length; i++) {
			
			m[i]=a[i];
		}
		int x=a.length;
		
		for(int i=0; i<b.length; i++) {
			
			
			m[x]=b[i];
			x++;
		}	
		
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i]+" ");
		}
	}
}
