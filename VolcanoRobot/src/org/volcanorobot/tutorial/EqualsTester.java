package org.volcanorobot.tutorial;

public class EqualsTester {
	public static void main(String[] arguments) {
		String str1, str2;
		str1 = "Free the bound periodicals. ";
		str2 = str1;
		
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		System.out.println("Same object? " + (str1==str2));
		
		str2 = new String(str1);
		
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		System.out.println("Same object? " + (str1==str2));
		System.out.println("Same value? "+ str1.equals(str2));
		//first part testing equals 
		
		Integer dataCount = new Integer(7801);
		int newCount = dataCount.intValue();
		System.out.println("\nnew count= "+newCount);
		// second part testing transform of types into object
		
		String s1 = new String("String 1");
		String s2 = "String 1";
		if (s1 == s2) {
		    System.out.println("Equal");}
		else {
		    System.out.println("Not equal");
		}
	}

}
