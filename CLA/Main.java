class Account{
    String holderName = "John Doe";

    void displayAccountDetails(){
        System.out.println("Account Holder: " + holderName);
    }
}

class SavingsAccount extends Account{
    double interestRate = 3.5;

    void displayDetails(){
        // Accessing superclass method using super
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class Main{
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount();
        sa.displayDetails();
    }
}