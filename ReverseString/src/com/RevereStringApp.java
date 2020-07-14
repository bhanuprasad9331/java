package com;

public class RevereStringApp {
	public static void main(String[] args) {
		String str="i am the brother of krishna!";
		String str2=reverseString(str);
		System.out.println(str2);
	}
	public static String reverseString(String str) {
		String str2="";
		for(int i=0;i<str.length();i++) {
			str2+=str.charAt(str.length()-1-i);
		}
		return str2;
	}
}
