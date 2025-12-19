
// Java Programming Notes from the Video
// Package declaration - use your own structure as needed
// package com.apnacollege;

// Import necessary classes
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class JavaNotes {
    public static void main(String[] args) {
        // 1. Setting Up Java Environment (Not code - setup instructions)

        // 2. Basic Java Program Structure
        System.out.println("Hello World");
        System.out.print("Hello Java");
        System.out.println();

        // 3. Variables and Data Types
        String name = "Aman";
        int age = 23;
        double price = 120.02;
        boolean isStudent = true;
        char grade = 'A';
        byte b = 127;
        short s = 32000;
        long l = 123456789L;
        float f = 3.14f;

        // 4. Type Casting (Conversion)
        int i = (int) price;  // Explicit casting
        double d = age;       // Implicit casting

        // 5. String Manipulation
        String str = "Apna College";
        System.out.println("Length: " + str.length());
        System.out.println("Char at 0: " + str.charAt(0));
        System.out.println("Replace: " + str.replace('A', 'B'));
        System.out.println("Substring: " + str.substring(0, 5));

        // 6. Arrays and Collections
        int[] marks = {97, 98, 95};
        System.out.println("Array Length: " + marks.length);
        System.out.println("First mark: " + marks[0]);
        Arrays.sort(marks);
        System.out.println("Sorted: " + Arrays.toString(marks));

        // 7. Input from User using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int inputAge = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter your name: ");
        String inputName = sc.nextLine();
        System.out.println("Hello " + inputName);

        // 8. Control Flow Statements
        if (inputAge >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other day"); break;
        }

        // 9. Loops in Java
        for (int j = 1; j <= 5; j++) System.out.println(j);
        int k = 5;
        while (k > 0) {
            System.out.println(k);
            k--;
        }
        int m = 1;
        do {
            System.out.println(m);
            m++;
        } while (m <= 5);

        for (int n = 1; n <= 10; n++) {
            if (n == 6) break;
            if (n == 3) continue;
            System.out.println(n);
        }

        // 10. Exception Handling
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }

        // 11. Methods (Functions) in Java
        printHello();
        printName("Aman");
        printSum(5, 10);

        // 12. Mini Project: Number Guessing Game
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Guess the number (1-100). Type -1 to exit.");
        while (guess != secret) {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess == -1) {
                System.out.println("Game stopped.");
                break;
            }
            if (guess < secret) System.out.println("Too low.");
            else if (guess > secret) System.out.println("Too high.");
            else System.out.println("Correct!");
        }
        sc.close();
    }

    // Method Definitions
    public static void printHello() {
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println("Name is: " + name);
    }

    public static void printSum(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }
}
