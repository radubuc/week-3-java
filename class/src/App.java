
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s1 = "cares";
//		String s2 = "s";
//		System.out.println(s1.concat(s2));
		
//		String s3 = "to";
//		String s4 = "get";
//		String s5 = "her";
//		System.out.println(s3.concat(s4).concat(s5));
		
		//Quiz Question 8
		String firstName = "Tom";
		String lastName = "Sawyer";
		System.out.println(firstName.concat(" ").concat(lastName));
		
		//Quiz Question 9
		double a = 3; 
        double b = 4; 
        System.out.println(Math.pow(a, b)); 
        
        //10     
        System.out.println("Difference: " + subtractFirstFromLast(ages));
   
		
		double[] numbers = {2.3, 4.7, 5.0, 10.9, 3465.9};
		System.out.println("Sum: " + sum(numbers));
		System.out.println("Average: " + average(numbers));
		
		String[] groceryList = {"eggs", "bacon", "coffee", "water"};
		System.out.println("Does this array have eggs? " + isInArray(groceryList, "eggs"));
		System.out.println("Does this array have apples? " + isInArray(groceryList, "apples"));		
	}
	
	//Start Methods
	
    //Quiz Question 10
	public String multiConcat (String str, int max) {
      String result = "";
      if(int = 0; int <= 3, int++) {
      result += str;
      return result;
    }
      OR
	public String multiConcat(String s, int n)
	{
	  String result = s;
	  /*If n < 2, no further action is taken and result is returned. Else loop is run n-1 times and s is added to result each time loop is executed.*/
	  if(n>1)
	  {
	    for(int i=2; i<=n ; i++)
	    {
	      result += s;
	    }
	  }
	  return result; 
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
	
//	Good Method, but not used above so will create errors
//	public static double withdraw(double[] amount, double balance) {
//		if(amount > balance) {
//			System.out.println("The amount is greater than the current balance, and we cannot withdraw.");
//			return balance;
//		} else {
//			balance -= amount;
//			System.out.println("Your new balance is $" + balance);
//			return balance - amount;
//		}
//	}

	//Quiz Question 8
//		public String fullName() {
//			return 
//			
//			
//		}
}

//arrayOne[i] == arrayTwo[i] How to compare something from one array to something in another array

