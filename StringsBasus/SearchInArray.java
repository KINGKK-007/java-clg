import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of fruits in array: ");
        int len = scanner.nextInt();
        scanner.nextLine();

        String[] fruits = new String[len];

        for(int i=0; i<fruits.length; i++){
            System.out.print("Enter a fruit: ");
            fruits[i] = scanner.nextLine();
        }

        System.out.println();

        for(String fruit : fruits){
            System.out.print(fruit + " ") ;
        } System.out.println();

        System.out.println();
        
        System.out.print("Enter a fruit to search: ");
        String target = scanner.nextLine();

        for(int i=0; i<fruits.length; i++){
            if (fruits[i].equals(target)) {
                System.out.println("Fruit " + target + " found at index " + i);
            }
        }

        scanner.close();

    }

}