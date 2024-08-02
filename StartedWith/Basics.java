public class Basics {
	public static void main(String[] args) {
		/*
		 * This is a 
		 * Multiline commenting in JAVA!!
		 * Anything inside this is a comment!!
		*/

		System.out.print("Hello world!! \n"); // if using print then have to add \n (escape sequence!)
		System.out.println("My FirstName is \"Shubhashish\" & LastName is \"Chakraborty\"... \n"); // In case of printline no need of adding \n
		
		// Variables:

		// int age; // Declaration
		// age = 12; // assignment

		int myAge = 23; // Initialisation!

		// int myPhoneNumber = 8979687756; // This number cannot be stored with data type int
		long myPhoneNumber = 8979687756L; // Add a capital L at the end , its a convention!!

		System.out.println("I am " + myAge + " Years Old!");
		System.out.println("Call me This is my Number: " + myPhoneNumber + "\n");

		float halfPie = 3.142857f; // using float so youve got to add a f at the end , Its the CONVENTION!! YK.
		// float PIE = 3.142857142857143f; // THIS WONT PRINT THE FULL VALUE!!
		double PIE = 3.142857142857143; // In case of double no need of any f at the end and it prints exact value!!

		System.out.println("Little PIE: " + halfPie);
		System.out.println("BIG PIE: " + PIE + "\n");

		boolean maritalStatus = true;

		System.out.println("Am i Married: " + maritalStatus + "\n");

		char atTheRate = '@'; // char only allows us to store a single character and surrounded by a single quote!!

		System.out.println("Here's My GMAIL ACCOUNT: " + "shubhashish69" + atTheRate + "gmail.com \n");

		String myFullName = "Shubhashish Chakraborty!";

		System.out.println("Call me " + myFullName);
		

		
	}
}