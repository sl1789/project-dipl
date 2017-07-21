package org.volcanorobot.tutorial;
import java.awt.Point;
public class RefTester {
	public static void main(String[] arguments){
		Point pt1, pt2;
		pt1 = new Point(100,100);
		pt2 = pt1;
		
		pt1.x=200;
		pt1.y=200;
		System.out.println("Point 1: "+ pt1.x+", "+pt1.y);
		System.out.println("Point 2: "+ pt2.x+", "+pt2.y);
		//here the result is that pt2 will also change, because of the reference in var pt1
		// if you want different values you have to create p2 = new Point(100,100)
		
		String s, s2;
		s = "item";
		s2 = String.valueOf(550);
		System.out.println("String s: "+s+" string s2: "+s2);
		s2 = s.valueOf(550);
		System.out.println("String s: "+s+" string s2: "+s2);
		// two different ways to call valueOf
	}

}
