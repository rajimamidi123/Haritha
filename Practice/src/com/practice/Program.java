package com.practice;

import java.util.Scanner;

public class Program {
public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int n= scanner.nextInt();
	
	int sum=0; int sum2=0;
	for( int i=1; i<=n;i++) {
		if(i%2==0) {
		sum += i;
		}
		else {
			sum2 +=i;
		}
		
		
	}
	
	System.out.println("sum of even number"+ sum);
	System.out.println("sum of odd number"+ sum2);
	
}
}
