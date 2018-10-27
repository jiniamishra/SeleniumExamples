package com.techcanvass.day1;

public class MyExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*int i = 5;
			int j =0;
			System.out.println(i/j); */
						
			//exception2
			int[] num = {1,4,8};
			System.out.println(num[4]);
		
			//exception3
		  String name= null;
		  System.out.println(name.length());
		  
			  
		  }
		catch (ArithmeticException a)
		{
			//a.printStackTrace();
			System.out.println("technical error");
		}
		catch(NullPointerException n)
		{
			//n.printStackTrace();
			System.out.println("technical error");
		}
		catch (ArrayIndexOutOfBoundsException i)
		{
			//i.printStackTrace();
			System.out.println("technical error");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("technical error");
		}
		finally
		{
			System.out.println("the program ends here");
		}
	}

}
