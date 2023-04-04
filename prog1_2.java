package arrayPrograms;

public class prog1_2 {
	
	//Design a method to merge two array element in zigzag manner.

	public static void main(String[] args) {
		
		int[]a= {2,4,2,6,5,9,5};
		int []b= {7,8,9};
		m1(a,b);
	}

	public static void m1(int []a, int[]b) {
		
		int []c=new int[a.length+b.length];
		
		int x=0;
		int y=0; 
		int z=0;
		
		while(x<a.length && y<b.length) {
			
			c[z]=a[x];
			z++;
			x++;
			
			c[z]=b[y];
			z++;
			y++;
			
		}
		
		while(x<a.length) {
			
			c[z]=a[x];
			z++;
			x++;
		}
		
		while(y<b.length) {
			c[z]=b[y];
			z++;
			y++;
		}
		
		for(int i=0; i<c.length; i++) {
			
			System.out.print(c[i]+" ");
		}
		
	}
}
