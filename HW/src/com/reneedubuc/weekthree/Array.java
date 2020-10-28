package com.reneedubuc.weekthree;

public class Array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println("Difference: " + difference(ages[0]-ages[8]));
		
		//Step 2
		String name1 = "Sam";
		String name2 = "Tommy";
		String name3 = "Tim";
		String name4 = "Buck";
		String name5 = "Bob";
		
		String[] names = new String[5];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Buck";
		names[4] = "Bob";
		
		
	}
	
	//Step 1
	public static int difference(int[] values) {
		int difference = 0;
		for(int num: values) {
			difference -= num;
		}
		return difference;
	}
	
	//Step 2
}
