package com.practice;

public class P12 {
	public static void main(String[] args) {
		int n=7;
		int i,j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(i==1|| i==n|| j==1|| j==n|| i==j|| i+j==n+1)
					System.out.print("* ");
				else {
					System.out.print(" ");
				}	
				}
				System.out.print("\n");	
		}	
	}
}
