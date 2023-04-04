package arrayPrograms;

import java.util.Scanner;

public class prog7 {

	public static void main(String[] args) {
		
		
		for(;;) {
			int[]a= {1, 2, 3, 4, 5, 6};
			m1(a);
		}
		
	}
	
	public static void m1(int []a) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Index: ");
		int index=sc.nextInt();
		
		int []m=new int[a.length-1];
		
		
		
		for(int i=0; i<index; i++) {
			
			m[i]=a[i];
			
		}
		
		for(int i=index; i<m.length; i++) {
			
			m[i]=a[i+1];
			
		}
		
		for(int i=0; i<m.length; i++) {
			
			System.out.print(m[i]+" ");
			
		}
		System.out.println();
		
		
	}
}

