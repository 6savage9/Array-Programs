package arrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class prog6 {
	
	    public static void main(String[] args)
	    {
	        int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
	       
	        int n = arr.length;
	        removeDuplicate(arr);
	 
	    }
	    
	    public static void removeDuplicate(int []a) {
	    	
	    	Map<Integer, Boolean> m=new LinkedHashMap<>();
	    	System.out.println(m);
	    	
	    	for(int i=0; i<a.length; i++) {
	    		System.out.println(m.get(a[i]));
	    	}
	    	
	    	System.out.println();
	    	
	    	for(int i=0; i<a.length; i++) {
	    		
	    		if(m.get(a[i])==null) {
	    			
	    			System.out.print(a[i]+" ");
		    		m.put(a[i], true);
	    		}
	    		
	    		
	    		
	    	}
	    	System.out.println();
	    	System.out.println(m);
	    	
	    	
	    }
	}

