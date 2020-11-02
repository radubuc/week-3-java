package com.reneedubuc.weekthree;

public class Array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println("Difference: " + subtractFirstFromLast(ages));
		
		//Step 1b
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 22};
		System.out.println("Difference: " + subtractFirstFromLast(ages2));
		
		//Step 1c
		int sum = 0;
		for(int number: ages2) {
			sum += number;
		}
		System.out.println(sum/ages2.length);
		
		//Step 2
//		String name0 = "Sam";
//		String name1 = "Tommy";
//		String name2 = "Tim";
//		String name3 = "Buck";
//		String name4 = "Bob";
		
		String[] names = new String[5];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Buck";
		names[4] = "Bob";
				
		//Step 2a
		double nameTotal = 0;
		
		for(String name: names) {
			nameTotal += name.length();
		}
		System.out.println(nameTotal/names.length);
		
		//Step 2b
		for(int i = 1; i <= 1; i++) {
			System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4]);
		}
		
		//Questions 3 and 4 are in Word Doc
		
		//Step 5
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++){
		    nameLengths[i] = names[i].length();
		    System.out.println(nameLengths[i]);
		}
				
		//Step 6 Print out sum of letters in names
		sum = 0;
		for(int k = 0; k < nameLengths.length; k++) {
			sum += nameLengths[k]; 
		}
		System.out.println(sum);
		
		//Step 7
		System.out.println(multiplyString("Hello", 3));
				
		//Step 8
		System.out.println(createFullName("Tom", "Sawyer"));
		
		//Step 9
		System.out.println("Boolean: " + isSumGreaterThan100(ages2));
				
		//Step 10
		double[] coins = {0.25, 0.50, 0.10, 1.00};
		System.out.println(findAverage(coins));
		
		//Step 11
		double[] coins2 = {0.05, 0.01, 0.25, 1.00};
		double[] coins3 = {0.01, 0.10, 0.25, 0.50};
//		System.out.println(compareAverages(coins2, coins3));
		//I give up
		
		//Step 12
		
		//Step 13
		
}
	
//Methods
	//Step 1a & b
	public static int subtractFirstFromLast(int[] array) {
		int difference = array[array.length - 1] - array[0];
		return difference;
	}
	
	//Step 7
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	
	//Step 8
	public static String createFullName(String a, String b) {
		String fullName = a + " " + b;
		return fullName;		
	}
	
	//Step 9
	public static Boolean isSumGreaterThan100(int[] array) {
		int sum = 0;
		for(int number: array) {
			sum += number;
		}
		
//		Note
//		if(sum > 100) {
//			return true;
//		} else {
//			return false;
//		} 
//		Same as below
		
		return sum > 100;
	}
	
	//Step 10
	public static double sum(double[] array) {
		double sum = 0;
		for(double num: array) {
			sum += num;
		}
		return sum;
	}
	
	public static double findAverage(double[] array) {
		double average = 0;
		if(array.length != 0) {
		average = sum(array)/array.length;
		}
		else {
		System.out.println("There are no numbers in given array.");
		}
		return average;
	}
	
	//Step 11
//	public static double findSums(double[] firstArray, double[] secondArray) {
//		double sum = 0;
//		for(double numA: firstArray) {
//			sum += numA;
//			return sum;
//		}
//		
//		for(double numB: secondArray) {
//			sum += numB;
//			return sum;
//		}
//	}
	
//	public static Boolean compareAverages(double[] firstArray, double[] secondArray) {
//		double average = 0;
//		average = sum(firstArray)/firstArray.length; 
//		average = sum(secondArray)/secondArray.length;
//		if(firstArray.length != 0) {	
//		}
//		return average(firstArray) > average(secondArray);
//		
//		else {
//		System.out.println("There are no numbers in given array(s).");
//		}
		//I feel like I'm close, but I'm having trouble connecting the two arrays! I think I need a .something?
//	}
	
	//Step 12
//	public static Boolean isHotOutside(boolean[] isHotOut) {
//	
//		return isHotOut;
//	}
//	
//	public static Boolean moneyInPocket(boolean[] hasMoney) {
//		
//		return hasMoney;
//	}
	
//	public static Boolean willBuyDrink(boolean[] isHotOutside, double[] moneyInPocket) {
//		
//	return isHotOutside && moneyInPocket > 10.50;
//	}
//	//I give up
//	
//	//Step 13-BYOM, keep track of spending
//	public static double accountWithdrawals(double[] startingBalance, double [purchaseA, double purchaseB]) {
//		double sum = 1000;
//		if(purchaseA != 0; i <= 1000; i--) {
//			System.out.println("New Balance: " + (sum-purchaseA));
//			sum -= purchaseA;
//		}
//		if(purchaseB != 0; i <= sum-PurchaseA; i--) {
//			System.out.println("New Balance: " + (sum-purchaseB));
//			sum -= purchaseB;
//		}
//		//I give up. Am I going to get stuck in an infinite loop because sum (balance really) will always be less than 1000?
//	}
}
	
	
