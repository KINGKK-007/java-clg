import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Calculate Area of Rectangle
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter length: ");
        double breadth = scanner.nextDouble();


        double area = length * breadth;
        System.out.println("Area of the Rectangle = " + area + "cm²");

        scanner.close();

    }
}