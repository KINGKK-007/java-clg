import java.util.Scanner;

public class main{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    
    public static void main(String[] args) { 
        
        //BANKING PROGRAM
        
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean isRunning = true;
        int choice;
        
        //PROGRAM
        while(isRunning){
            
            //DISPLAY MENU
            System.out.println(RED + "-----------------" + RESET);
            System.out.println(GREEN + " BANKING PROGRAM" + RESET);
            System.out.println(RED + "-----------------" + RESET);
            System.out.println(YELLOW + "1. Show balance" + RESET);
            System.out.println(YELLOW + "2. Deposit" + RESET);
            System.out.println(YELLOW + "3. Withdraw" + RESET);
            System.out.println(YELLOW + "4. Exit" + RESET);
            System.out.println(RED + "-----------------" + RESET);
            
            //PROCESS USERS CHOICE
            System.out.print(BLUE + "Enter your choice: " + RESET);
            choice = sc.nextInt();

            System.out.println(RESET);
            
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = makeDeposit(balance, sc);
                case 3 -> balance = withdrawFunds(balance, sc);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID");
            }
        }

        //EXIT MESSAGE
        System.out.println(CYAN + "Thank you for using the banking program. Goodbye!" + RESET);
    }

    //showBalance
    public static void showBalance(double balance){
        System.out.println(PURPLE + "Your balance is: " + balance + RESET);
    }
    
    //makeDeposit
    public static double makeDeposit(double balance, Scanner sc){
        System.out.print(BLUE + "Enter the amount to deposit: " + RESET);
        double deposit = sc.nextDouble();
        if (deposit > 0) {
            balance += deposit;
            System.out.println(GREEN + "Deposit successful. New balance: " + balance + RESET);
        } else {
            System.out.println(RED + "Invalid deposit amount." + RESET);
        }
        return balance;
    }

    //withdrawFunds
    public static double withdrawFunds(double balance, Scanner sc){
        System.out.print(BLUE + "Enter the amount to withdraw: " + RESET);
        double withdraw = sc.nextDouble();
        if (withdraw > 0 && withdraw <= balance) {
            balance -= withdraw;
            System.out.println(GREEN + "Withdrawal successful. New balance: " + balance + RESET);
        } else {
            System.out.println(RED + "Invalid or insufficient funds." + RESET);
        }
        return balance;
    }
}