package com.techcanvass.day1;

public class My2DArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = { {2,3,4,0}, {4,5,6, 1} , {2,7,8,9}, {0,4,7,9} };
		int[][] num1 = { {2,3}, {1,6,7}, {8,9,10,0}}; // this is also correct
		System.out.println(num[2][1]);
		System.out.println(num[3][0]);
		
		//using for loop to print all 2d array
		
		for (int row=0; row< num.length; row ++)
		{
			System.out.println();
			for(int col = 0; col<num[row].length; col ++)
			{
				System.out.print(num[row][col] +"\t");
			}
		}
	}

}
