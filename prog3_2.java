package arrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class prog3_2 {
	
	//Design a method to display number of occurrence of each element in the array.

	public static void main(String[] args) {
		
		int[]a= {2,4,2,6,5,9,5};
		m1(a);
	}
	
	public static void m1(int []a) {
		
		Map m=new LinkedHashMap<>();
		
		for(int i=0; i<a.length; i++) {
			
			int x=a[i];
			int count=0;
			
			for(int j=0; j<a.length; j++) {
				
				if(x==a[j]) {
					count++;
				}
			}
			
			m.put(x, count);
		//	System.out.println(x+" "+count);
			
		}
		
		System.out.println(m);
		
	}
}
