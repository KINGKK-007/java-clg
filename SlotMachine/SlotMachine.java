import java.util.Random;
import java.util.Scanner;

public class SlotMachine{

    public static void main(String[] args){

        System.out.println("\n***************************");
        System.out.println("  WELCOME TO SLOT MACHINE  ");
        System.out.println("     🍒  🍋  🍉  🔔  ⭐️    ");
        System.out.println("***************************\n");

        Scanner scanner = new Scanner(System.in);

        String playAgain = "y";
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        while( (playAgain.equals("y")) && balance > 0){

            System.out.println("Your current balance is $" + balance);
            System.out.print("Enter bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            
            if(bet <= 0 || bet > balance){
                System.out.println("Invlaid bet amount. Try again.");
                continue;
            }
            
            balance -= bet;

            row = getRow();
            System.out.println("\nSpinning...\n");
            printRow(row);
            payout = getPayout(row, bet);

            balance += payout;
            if(payout > 0) System.out.println("You won $" + payout);
            System.out.println();
            
            if(balance <= 0){
                System.out.println("Balance 0... Better luck next time!\n");
                break;
            }
            
            System.out.print("Play again (Y/N) : ");
            playAgain = scanner.nextLine().toLowerCase();
            System.out.println();

        }

        scanner.close();

    }

    static String[] getRow(){
        Random random = new Random();
        String[] options = { "🍒", "🍋", "🍉", "🔔", "⭐️"};
        String[] row = new String[3];
        for(int i=0; i<=2; i++){
            row[i] = options[random.nextInt(0,5)];
        }
        return row;
    }

    static void printRow(String[] row){
        System.out.println("-------------");
        for (int i=0; i<row.length; i++){
            System.out.print("| " + row[i]);
        } System.out.println("|");
        System.out.println("-------------");
    }

    static int getPayout(String[] row, int bet){
        int payout;
        
        if( (row[0].equals(row[1])) && (row[2].equals(row[1])) ){
            payout = 5 * bet; //all 3 match
            System.out.println("YOU WIN BIG!!!");
        } 
        else if(row[0].equals(row[1])){
            payout = 2 * bet; //first 2 match
            System.out.println("YOU WIN!");
        } 
        else if(row[1].equals(row[2])){
            payout = 2 * bet; //last 2 match
            System.out.println("YOU WIN!");
        } 
        // else if(row[2].equals(row[0])){
        //     payout = 2 * bet; //first and last match ...?
        //     System.out.println("YOU WIN!");
        // } 
        else {
            payout = 0;
            System.out.println("YOU LOST!");
        }
        return payout;
    }

}