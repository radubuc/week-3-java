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
		double[] coins = {0.25, 0.50, 0.10, 1.00};//.3275
		System.out.println(findAverage(coins));
		
		//Step 11
		double[] coins2 = {0.05, 0.01, 0.25, 1.00}; // .3275
		double[] coins3 = {0.01, 0.10, 0.25, 0.50}; // .215
		System.out.println(findSums(coins2, coins3));
		
		
		//Step 12
		double moneyInPocket = 13.50;
		boolean isHotOutside = false;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//Step 13-BYOM, keep track of spending. startingBalance - withdrawal 1 = newAccountBalance, newAccountBalance - withdrawal2 = newAccountBalance
		double accountBalance = 1000;
		
		double[] withdrawal = new double[2];
		
		withdrawal[0] = 75.50;
		withdrawal[1] = 100.25;
		
		double newAccountBalance = (accountBalance - withdrawal[0] - withdrawal[1]);
		
		System.out.println(newAccountBalance);
		//I can't get it to pull from method! The only way I could get the correct answer of 824.25 was to do it all in main! The second newAccountBalance would have to override the first...
		
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
	static double sum1 = 0;
	static double sum2 = 0;
	
	public static Boolean findSums(double[] firstArray, double[] secondArray) {
		double[] results = new double[2];
		for(double numA: firstArray) {
			sum1 += numA;
		}
		for(double numB: secondArray) {
			sum2 += numB;
		}
		results[0] = sum1;
		results[1] = sum2;
		System.out.println("Boolean: true or false if array 1 is greater than array 2");
		return  compareAverages(results, firstArray, secondArray);
	}
	
	public static Boolean compareAverages(double[] results, double[] firstArray, double[] secondArray ) {
		double average1 = 0;
		double average2 = 0;
		
		average1 = (results[0])/firstArray.length; 
		average2 = (results[1])/secondArray.length;
		return average1 > average2;
	}
	
	//Step 12
	public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		System.out.println("Boolean: true if is hot outside and money greater than 10.50");
	return isHotOutside && moneyInPocket > 10.50;
	}
	
	//Step 13-BYOM, keep track of spending. startingBalance - withdrawal 1 = newAccountBalance, newAccountBalance - withdrawal2 = newAccountBalance
	public static double newAccountBalance(double accountBalance, double[] withdrawals) {
		double newAccountBalance = 0;
		for(double withdrawal : withdrawals) {
			newAccountBalance -= withdrawal;
			return newAccountBalance;
		}
		return newAccountBalance;
	}			
//		for(double d = 0; d <= withdrawals.length; d--) {
//			= withdrawals;
//			return newAccountWithdrawals;
//			}
		
		
//		double money = 0;
//		for(double withdrawal : withdrawals) {
//			accountBalance -= withdrawal;
//			return (accountBalance, withdrawal);
//		}
//		return money;
	

}

	
	
