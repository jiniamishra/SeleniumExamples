package com.techcanvass.day1;

public class ArithmeticOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = 6;
		
		/* int sum = num1 + num2;
		System.out.println("sum = " +sum);
        
		int sub = num1 - num2;
		System.out.println("sub =" +sub);
		
		int mul = num1 * num2;
		System.out.println("mul =" +mul);
		
		int div = num1 / num2;
		System.out.println("div = " +div); */
		
		System.out.println("sum = " + addition(num1 , num2));
		System.out.println("sub = " + substraction(num1 , num2));
		System.out.println("mul = " + multiply(num1 , num2));
		System.out.println("div = " + divide(num1 , num2));
	}
	
	public static int addition(int number1 , int number2) 
	{
		int sum = number1 + number2 ;
		return sum;
	}
	public static int substraction(int number1 , int number2) 
	{
		int sub = number1 - number2; ;
		return sub;
	}
	public static int multiply(int number1 , int number2) 
	{
		int mul = number1 * number2; ;
		return mul;
	}
	public static int divide(int number1 , int number2) 
	{
		int div = number1 / number2; ;
		return div;
	}
}
