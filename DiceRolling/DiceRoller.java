import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int times;

        System.out.print("Enter number of die to roll: ");
        times = scanner.nextInt();

        int score = 0;
        
        for(int i=1; i<=times; i++){

            Random random = new Random();
            int randomNum = random.nextInt(1,7);

            System.out.println("\nDice roll " + i + ":");
            roll(randomNum);

            score += randomNum;

        }

        System.out.println("\nYour total score is " + score + " !");

        scanner.close();

    }

    static void roll(int num){

        char a = ' ', b = ' ', c = ' ', d = ' ', e = ' ', f = ' ', g = ' ', h = ' ', i = ' ';

        switch(num){
            case 1 -> e = '*';
            case 2 -> {
                b = '*';
                h = '*';
            }
            case 3 -> {
                a = '*';
                e = '*';
                i = '*';
            }
            case 4 -> {
                a = '*';
                c = '*';
                i = '*';
                g = '*';
            }
            case 5 -> {
                a = '*';
                c = '*';
                i = '*';
                g = '*';
                e = '*';
            }
            case 6 -> {
                a = '*';
                b = '*';
                c = '*';
                i = '*';
                g = '*';
                h = '*';
            }
        }

        System.out.println("\n ------- ");
        System.out.println("| "+a+" "+b+" "+c+" |");
        System.out.println("| "+d+" "+e+" "+f+" |");
        System.out.println("| "+g+" "+h+" "+i+" |");
        System.out.println(" ------- \n");

        System.out.println("Output = " + num);

    }

}