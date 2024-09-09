import java.util.Scanner;

public class RepeatAdditionQuiz{
	public static void main(String[] args){

		int number1 = (int)(Math.random() * 20);
		int number2 = (int)(Math.random() * 20);

		// create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print(
			"What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		while (number1 + number2 != answer){
			System.out.print("Wrong answer . Try again. what is "
				+ number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}
		
		System.out.println("You got it! ");
	}
}

// so if it was just (int)(Math.random()) then there wouldnt be any values
// why we put the values to be multipiled is to show a range 
// hence Math.random * 20 => gives numbers 1-20 to be added
// Math.random just randomly picks a number in that range you put
// the int infront of the Math.random() limits it only to integers
// it can be double or float but we just want to use integers
// Always keep in mind what kind of variable u are using
// example int should always go with int and double should always go with double