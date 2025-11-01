import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variables
        double num1;
        double num2;
        char operation;
        double answer;

        //inputs
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println(num1);

        System.out.print("Enter operation (+,-,*,/,^): ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        //operation
        switch(operation){
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Division by 0!");
                    answer = -1;
                }
                else{
                    answer = num1 / num2;
                } 
            }
            case '^' -> answer = Math.pow(num1, num2);
            default -> answer = -1;
        }

        //output
        System.out.printf("%.2f\n", answer);

        scanner.close();

    }
}