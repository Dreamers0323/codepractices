import java.util.Scanner;

public class AdditionQuiz{
	public static void main(String[] args){

		double numb1 = (double)(Math.random() * 10.0);
		double numb2 = (double)(Math.random() * 10.0);

		Scanner input = new Scanner(System.in);

		System.out.println("What is " + numb1 + " + " + numb2 + "? ");
		double answer = input.nextDouble();

		while (numb1 + numb2 != answer){
			System.out.print("your answer is wrong!!!! Try again you dumb FUCK!			");
			answer = input.nextDouble();
		}

		System.out.println("you got it !! ");
		
	}
}