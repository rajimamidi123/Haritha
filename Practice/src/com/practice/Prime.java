package com.practice;

public class Prime {
public static void main(String arg[]) {
	int n=6;
	int c=0;
	for(int i=1;i<=n;i++) {
		if(n%1==0) {
		c++;
	}
	}
	if(c==2)
		System.out.println("prime");
		
	else {
			System.out.println("is not prime");
		}
	}

}
