package com.practice;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter starting number:");
		int startingNumber=scanner.nextInt();
		
		System.out.println("please enter ending number:");
		int endingNumber=scanner.nextInt();
		
		int number=startingNumber;
		while(startingNumber <=endingNumber) {
			
			if(startingNumber%2==0) {
				
			for(int i=1;i<=20;i++) {
				
			System.out.println(startingNumber+" x" + i+ "=" + startingNumber * i);
			
			}
			}
				System.out.println();
			startingNumber++;
			
	}
	scanner.close();
	}
}
