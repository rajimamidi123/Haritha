package com.practice;

public class Rectangle {


	public static void main(String[] args) {
		int l=5 ,w=7;
		int  area,perimeter ;
		area=l*w;
		perimeter=2*(l+w);
		System.out.println("area is " +area);
		System.out.println("perimeter is" +perimeter);
		
		int a=2,b=3,c=5;
		int  p;
		p=a+b+c;
		System.out.println(p);
		System.out.println((((8+2345)/3)%5)*5);
		System.out.println(23 == 45); 
		
		int marks1 = 78;
		int marks2 = 45;
		int marks3 = 62;
		int total = marks1+marks2+marks3;
		double percentage = (total/(300.0))*100;
		System.out.printf( "total %d\npercentage %f\n",total,percentage);
		System.out.println(Math.pow(7, 5));
		float Fahrenheit,Celsius;
		Fahrenheit = 43;
		Celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("Temperature in Celsius is:"+Celsius);
		
		
	}

}
