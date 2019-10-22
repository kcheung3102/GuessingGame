import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int guess = 0;
        int secretNum;
        secretNum = 6;
        int guessCount = 0;


        Scanner myObj = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10: ");
        guess = myObj.nextInt();

        while (guess != secretNum) {
            if (guess <= 0) {
                System.out.println("Enter a number between 1 and 10 ");
                System.out.println("Enter another number: ");
                guess = myObj.nextInt();
            } else if (guess > secretNum) {
                System.out.println("Too high. Guess Again: ");
                guess = myObj.nextInt();
                guessCount++;
            } else if (guess < secretNum) {
                System.out.println("Too Low. Guess Again: ");
                guess = myObj.nextInt();
                guessCount++;
            } else if( guess == secretNum) {
                System.out.println("Thats right!");
                break;
            }
            if(guessCount >= 5) {
                System.out.println("Sorry you're out of guesses");
                break;
            }
        }

    }
}

