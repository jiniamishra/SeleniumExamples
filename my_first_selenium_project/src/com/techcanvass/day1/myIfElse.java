package com.techcanvass.day1;

public class myIfElse {

	public static void main(String[] args) {
		
		//testing if
        int month = 2;
        if (month ==2)
        {
        	System.out.println("It is february");
        }
        //testing if else
        int day = 1;
        if (day == 1)
        {
        	System.out.println("it is day 1");
        }
        else
        {
        	System.out.println("it is any other day");
        }
        //testing else if 
		int grade = 20;
		if (grade >= 60) {
			System.out.println("first division");
		}
			else if (grade >=45 && grade <60) {
				System.out.println("second division");
				
			}
				
			else {
				
			System.out.println("Fail");
		}
	}

}
