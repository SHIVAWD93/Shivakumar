package com.technoelevate.inheritance;

import java.util.Objects;

public class PalindromOfString {

	public static void main(String[] args) {
 String s="shs";
  String s1="";
  for(int i=0;i<s.length();i++) {
	  s1= s.charAt(i)+s1;
  }
System.out.println(s1);

if(Objects.equals(s, s1)) {
	System.out.println("given string is palindrom");}

	else {
		System.out.println("not a palindrom");
	}
}
}


