
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numbers = {2.3, 4.7, 5.0, 10.9, 3465.9};
		System.out.println("Sum: " + sum(numbers));
		System.out.println("Average: " + average(numbers));
		
		String[] groceryList = {"eggs", "bacon", "coffee", "water"};
		System.out.println("Does this array have eggs? " + isInArray(groceryList, "eggs"));
		System.out.println("Does this array have apples? " + isInArray(groceryList, "apples"));

	}
	
	public static double sum(double[] values) {
		double sum = 0;
		for(double num: values) {
			sum += num;
		}
		return sum;
	}
			
	public static double average(double[] values) {
		double average = 0;
		if(values.length !=0) {
		average = sum(values)/values.length;
		}
		else {
		System.out.println("There are no numbers in given array.");
		}
		return average;
	}
	
	public static boolean isInArray(String[] array, String value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return true;
			}
		}
		return false; //Outside of for loop so it checks all items instead of just first before returning false
		}
	
	//Good Method, but not used above so will create errors
	public static double withdraw(double[] amount, double balance) {
		if(amount > balance) {
			System.out.println("The amount is greater than the current balance, and we cannot withdraw.");
			return balance;
		} else {
			balance -= amount;
			System.out.println("Your new balance is $" + balance);
			return balance - amount;
		}
	}
}

//arrayOne[i] == arrayTwo[i] How to compare something from one array to something in another array
