import java.util.Scanner;

public class BankingProgram{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double balance = 0.00;
        int choice;
        boolean isRunning = true;

        while(isRunning){

            System.out.println();

            System.out.println("********************");
            System.out.println("*  BANKING PROGRAM *");
            System.out.println("********************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1/2/3/4): ");

            choice = scanner.nextInt();

            if (choice == 4) {
                isRunning = false;
                System.out.println("BYE!");
                continue; 
            }

            if (choice == 1){
                showBalance(balance);
            }
            else if (choice == 2){
                System.out.print("Enter amount (in $): ");
                double amount;
                amount = scanner.nextDouble();
                if (amount < 0){
                    System.out.println("\nCant deposit negative amount.");
                    continue;
                }
                balance = deposit(balance, amount);
            }
            else if (choice == 3){
                System.out.print("Enter amount (in $): ");
                double amount;
                amount = scanner.nextDouble();
                if (amount > balance){
                    System.out.println("\nINSUFFICIENT FUNDS!");
                    continue;
                }
                balance = withdraw(balance, amount);
            }

        }

        scanner.close();

    }

    static void showBalance(double balance){
        System.out.println("\nYour balance is $" + balance);
    } 

    static double deposit(double balance, double amount){
        double newBal = balance + amount;
        System.out.println("\nYour balance is $" + newBal);
        return newBal;
    } 

    static double withdraw(double balance, double amount){
        double newBal = balance - amount;
        System.out.println("\nYour balance is $" + newBal);
        return newBal;
    } 

}