import java.util.Scanner;
import java.util.Random;

class Dice {
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}

class Game {
    private Dice dice;
    private int targetSum;

    public Game() {
        this.dice = new Dice();
        this.targetSum = 10;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);
            if (roll1 + roll2 == targetSum) {
                System.out.println("You win!");
                break;
            } else {
                System.out.print("You lose! Do you want to play again? (yes/no): ");
                String playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes")) {
                    System.out.println("Thanks for playing!");
                    return;
                }
            }
        }
    }
}

public class DiceGame {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the dice game!");
        while (true) {
            System.out.print("Do you want to play? (yes/no): ");
            String playGame = scanner.nextLine().toLowerCase();
            if (!playGame.equals("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
            game.play();
        }
    }
}
