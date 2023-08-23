package com.practice;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "3";
		String b = "12";
		String result = b.concat(a);
		String result2 = b + a;
		System.out.println(result);
		System.out.println(result2);
		int number = 12;
		String str = String.valueOf(number);
		System.out.println(number);
		boolean c = true;
		String s = String.valueOf(c);
		System.out.println(s);
		String d = "1234";
		System.out.println(d.length());
		String h = "guilkh";
		h.charAt(4);
		String f = String.valueOf(h);
		System.out.println(h.charAt(4));
		String g = "11";
		String j = "13";

		System.out.println(g.equals(j));
		j.compareTo(j);
		System.out.println(j.compareTo(j));

	String v = "1134";
		System.out.println(v.substring(1));
		
		System.out.	println(v.substring(1, 3));
		
		

	}

}
