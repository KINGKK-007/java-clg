import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissor"};
        String userMove;
        String computerMove;
        boolean running = true;
 
        do {
            System.out.print("Enter your move (rock/paper/scissor) : ");
            userMove = scanner.nextLine();

            int rand = random.nextInt(0,3);
            computerMove = moves[rand];
            System.out.println("Computer's Move : " + computerMove);

            userMove = userMove.toUpperCase();
            computerMove = computerMove.toUpperCase();

            if (userMove.equals(computerMove)){
                System.out.println("It's a TIE!");
            }
            else if ( (userMove.equals("ROCK") && computerMove.equals("SCISSOR")) ||
                    (userMove.equals("PAPER") && computerMove.equals("ROCK")) ||
                    (userMove.equals("SCISSOR") && computerMove.equals("PAPER")) ){
                System.out.println("YOU WIN!");
            }
            else {
                System.out.println("YOU LOSE!");
            }

            System.out.print("Play again? (yes/no) : ");
            String yesOno = scanner.nextLine();
            yesOno = yesOno.toLowerCase();
            if(yesOno.equals("yes")) running = true;
            else running = false;
    
        } while(running);

        scanner.close();

    }

}