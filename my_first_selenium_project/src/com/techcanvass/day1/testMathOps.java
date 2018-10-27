package com.techcanvass.day1;

public class testMathOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//here we are calling the functions from another class which is mathOps
		int num1 = 7;
		int num2 = 6;
		
		mathOps ops1 = new mathOps();
		System.out.println("sum = " +ops1.addition(num1, num2));
		System.out.println("sub = " +ops1.substraction(num1, num2));
		System.out.println("mul = " +ops1.multiply(num1, num2));
		System.out.println("div = " +ops1.divide(num1, num2));
	}

}
