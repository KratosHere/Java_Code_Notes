import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Name: "); // NAME
		String UserName = scanner.nextLine();

		System.out.print("Enter Your Age: "); // AGE
		int UserAge = scanner.nextInt();

		System.out.print("Gibberish Value of PIE: "); // BIG FLOAT (DOUBLE)
		double UserPie = scanner.nextDouble();
		scanner.nextLine(); // HAVE TO ADD THIS NEXTLINE IF FURTHER ACCEPTING ANY INPUT VIA nextLine()

		System.out.print("Enter Your Father's Name: "); // Father's Name
		String FatherName = scanner.nextLine();
		System.out.println(); // FOR A LINE BREAK!

		System.out.println(String.format("MySelf %s & im %d Years old! , My Father's Name is %s\n" , UserName , UserAge , FatherName)); // String-Variable Injection!

		System.out.println(String.format("Pie is %f According to %s s/o %s" , UserPie , UserName , FatherName));

	}
}