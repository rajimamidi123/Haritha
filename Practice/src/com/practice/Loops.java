package com.practice;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
//		//int n = 20;
//	//	for ( int i = 1; i <= 20; i++) {
//		//	System.out.println("20*" + i + "=" + 20 * i);
//
//		}

		Scanner read = new Scanner(System.in);
		int n = read.nextInt();

		System.out.println("enter the value");
		for(int i=1;i<=10;i++) {
			System.out.println("n*"+i+ "="+ n*i);
		}
		for(int t=1;t<=n;t++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(t+"*"+i+"="+t*i);
			}
			System.out.println();
		}
	}

}
