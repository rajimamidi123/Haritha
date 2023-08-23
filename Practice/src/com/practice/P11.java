package com.practice;

public class P11 {
public static void main(String[] args) {
	int n=5;
	int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=n;j++) {
			if(j==1||j==n||i==1||i==n)
				System.out.print("*");
			else {
				System.out.print(" ");
			}	
			}
			System.out.print("\n" );	
	}	
}
}

