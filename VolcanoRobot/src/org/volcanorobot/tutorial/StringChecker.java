package org.volcanorobot.tutorial;

public class StringChecker {
	
	public static void main(String[] arguments){
		String str = "Nobody ever went broke by buying IBM";
		System.out.println("The string is: "+ str);
		System.out.println("Length of this string: "+str.length());
		System.out.println("The character at position 5: " + str.charAt(5));
		System.out.println("The substring from 26 to 32: "+ str.substring(26, 32));
		System.out.println("The index of the character v: "+ str.indexOf('v'));
		System.out.println("The index of the beginning of the "+ "substring \"IBM\": " + str.indexOf("IBM"));
		System.out.println("The string in upper case: "+ str.toUpperCase());
		
		int accountBalance =5005;
		System.out.format("Balance: $%,d%n", accountBalance);
	    //here we add comma to the integer
	
	}

}
