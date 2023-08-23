package com.practice;

import java.util.Scanner;

public class PrimeN {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int i,j;
		int c=0;
		System.out.println("enter n value:");
		for( j=2;j<=n;j++) {
			
			for( i=1;i<j;i++)
			{
				if(j%i==0) {
			c++;
		}
		}
		
			if(c==2) {
		}
			System.out.println("prime numbers between 1 to "+n+" are");
		System.out.println(j+" "); }

	}

}
