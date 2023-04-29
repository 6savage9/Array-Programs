package array;

import java.util.Scanner;

public class ConvertIntegerToRoman {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int []i={1000, 500, 100, 50, 10, 5, 1};
		
		String []s= {"M", "D", "C", "L", "X", "V", "I"};
		
		StringBuilder sb=new StringBuilder();
		
		int num=sc.nextInt();
		
		for(int m=0; m<i.length; m++) {
			
			while(num>=i[m]) {
				num=num-i[m];
				sb.append(s[m]);
			}
		}
		
		System.out.println(sb);
	}
}
