import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt(1,101);
        int guess;
        int attempts = 0;

        do{
            System.out.print("Guess a number between 1-100: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess > randomNum) System.out.println("Try lower!");
            if(guess < randomNum) System.out.println("Try higher!");
        } while(guess != randomNum);

        System.out.println("Congratulations! You took " + attempts + " attempts to guess the number.\n");

        scanner.close();

    }
}