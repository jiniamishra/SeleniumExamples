package com.techcanvass.day1;

public class mySwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int month = 8;
    switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 9:
		System.out.println("no of days in the month is 31");
		break;
	case 2:
	case 6:
	case 8:
		System.out.println("no of days in the month is 30");
		break;
	default:
		System.out.println("it is not a valid month");
		break;
	}
    
	}

}
