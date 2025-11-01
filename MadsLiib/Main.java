import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        String a1;
        String n1;
        String a2;
        String v1;
        String a3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter adjective1: ");
        a1 = scanner.nextLine();
        System.out.print("Enter noun1: ");
        n1 = scanner.nextLine();
        System.out.print("Enter adjective2: ");
        a2 = scanner.nextLine();
        System.out.print("Enter verb1: ");
        v1 = scanner.nextLine();
        System.out.print("Enter adjective3: ");
        a3 = scanner.nextLine();

        System.out.println("\nI went to a " + a1 + " restaurant.");
        System.out.println("There i saw a " + a2 +  " " + n1 +  ".");
        System.out.println("I became " + a3 +  ".");

        scanner.close();

    }

}