package com.technohyb.collection;

import java.util.Iterator;

import com.technoelevate.arraylist.SuperHeros;

public class Grocerycart {
	  int price =10;
	public String food(int numberOfunits ) {
		double PricePerunit=15.5;
		double totalPrice=PricePerunit*numberOfunits;
	return	"Food Is Added" +"  and price  for  "+numberOfunits +"  Items  are  "+totalPrice;
	}
	public String clothes(int numberOfunits) {
		double PricePerunit=30.5;
		double totalPrice=PricePerunit*numberOfunits;
		 return "Clothes are Added"+"  and price  for  "+numberOfunits +"  Items are  "+totalPrice;
	}
	public String electronics(int numberOfunits) {
		double PricePerunit=2000.5;
	double totalPrice=PricePerunit*numberOfunits;
	return "Electronics are added"+"  and price  for  "+numberOfunits +"  Items are  "+totalPrice;
	}
	
}
