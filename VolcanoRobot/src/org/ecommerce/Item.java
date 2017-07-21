package org.ecommerce;

import java.util.*;

public class Item implements Comparable{
	private String id;
	private String name;
	private double retail;
	private int quantity;
	private double price;
	
	Item(String idIn, String nameIn, String retailIn, String quanIn){
		id = idIn;
		name = nameIn;
		retail = Double.parseDouble(retailIn);//string to double
		quantity = Integer.parseInt(quanIn);
		if (quantity > 400)
			price = retail*.5D;//D mask for double
		else if (quantity > 200)
			price = retail*.6D;
		else
			price = retail*0.7D;
		price= Math.floor(price *100+0.5)/100;
		
	}
	
	public int compareTo(Object obj){
		Item temp = (Item)obj;//mask for Item
		if (this.price<temp.price)
			return 1;
		else if (this.price<temp.price)
			return -1;
		return 0;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public double getRetail(){
		return retail;
	}
	public int getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}

}
