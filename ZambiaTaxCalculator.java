import java.util.Scanner;

// initiate HashMap to store user detail information
import java.util.HashMap;

public class ZambiaTaxCalculator{
	public static void main(String[] args){

		// create Scanner and HashMap
		Scanner input = new Scanner(System.in);
		HashMap<String, String> accountDetails = new HashMap<>();
		
		
		
		System.out.println("Hello, i am a tax calculator, please answer the following questions for me to help you, ");
		System.out.println("Enter user name and press enter: ");
		String userName = input.next();

		System.out.println("Enter bank account number: ");
		String accountNumber = input.next();
			
			// storing user info
		accountDetails.put(userName, accountNumber);
			
	
		// user should now insert their salary(income)
		System.out.println("insert income (K0.00): ");
		double incomeNum = input.nextDouble();
		System.out.println("Great! lets begin the calculations");

		//defining tax rate
		double taxRate = 0.2; // this is the 20% tax rate 

		// calculating the total tax due and netsalary
		double taxDue = incomeNum * taxRate;
		double netSalary = incomeNum - taxDue;

		// time to display results
		System.out.println("Salary: " + incomeNum);
		System.out.println("Your tax due: " + taxDue);
		System.out.println("Your net salary: " + netSalary);

		
		
	}
}