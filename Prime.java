package org.files;

import java.util.Scanner;

public class Prime {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		boolean flag = false;
		
		for(int i=2; i<=value/2;i++) {
			if(value % i==0) {
				
				flag = true;
				break;
			}
		}
			if(flag) {
				System.out.println(value + " is not prime");
			}else {
				System.out.println(value + " is prime");
			}
			
		}
	}


