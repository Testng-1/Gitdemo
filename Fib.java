package org.files;

public class Fib {
	public static void main(String[] args) {
		
		int num = 10 ,a =0, b=1;
		
		for(int i=0; i< num; i++) {
			
			int c= a+b;
			a=b;
		    b=c;
		    System.out.println(c);
		System.out.println(c);


		}
		
	}

}
