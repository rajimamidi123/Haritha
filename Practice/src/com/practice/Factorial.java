package com.practice;

public class Factorial {
public static void main(String arg[]) {
	int n=6;
	int s=0;
	for(int k=1;k<=n;k++) {
		int fact=1;
		
		for(int i=k;i>=1;i--)
		{
		fact=fact*i;
		
		}
		s=s+=fact;
		System.out.println(fact);
		

	}
	System.out.println(s);
	}

}
