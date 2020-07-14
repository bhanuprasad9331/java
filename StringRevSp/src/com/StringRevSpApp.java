package com;

public class StringRevSpApp {
	public static void main(String[] args) {
		String str="ab^d&ko(0";
		Character[] ca=new Character[str.length()];
		for(int i=0;i<str.length();i++)
			ca[i]=str.charAt(i);
		String s2=stringRevSp(ca);
		System.out.println(s2);
	}
	public static String stringRevSp(Character[] ca) {
		int r=ca.length-1, l=0;
		String str="";
		while(l<r) {
			if(!Character.isAlphabetic(ca[l]))
				l++;
			else if(!Character.isAlphabetic(ca[r]))
				r--;
			else {
				char temp=ca[l];
				ca[l]=ca[r];
				ca[r]=temp;
				l++;
				r--;
			}
		}
		for(int i=0;i<ca.length;i++)
			str+=ca[i];
		return str;
	}
}
