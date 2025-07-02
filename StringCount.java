package org.files;

public class StringCount {
public static void main(String[] args) {
	
	String s = "Welcome";
	int capscount = 0 ,  smallcount =0 , vowels = 0, cons = 0;
	String c = "";
	String sm = "";
	String vowells ="", conns ="";
	for(int i =0; i<s.length(); i++) {
		
		char s2 = s.charAt(i);
		
		if(Character.isUpperCase(s2)) {
			
			capscount++;
			c= c+s2;
		}
		else {
			
			smallcount++;
			sm = sm + s2;	
			
		}
		
		if(s2=='a' || s2 == 'e'|| s2 == 'i' || s2 =='o'|| s2 =='u') {
			
			vowels++;
			vowells = vowells + s2;
		}
		else {
			cons++;
			conns = conns + s2;
		}
	}	
	

System.out.println(capscount + " of given string " + c);
System.out.println(smallcount + " of given string " + sm);
System.out.println(vowells + " vowels of given string " + vowels );
System.out.println(conns +" consonant of given string  " + cons);







}

      





}
