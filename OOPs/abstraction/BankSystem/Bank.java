abstract class Bank {

    String name;

    abstract double getRateOfInterest();

    void displayBankName(){
        System.out.println("Bank : " + this.name);
    }

}