import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Hangman{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String word_;
        System.out.println("\n\t*******************************");
        System.out.println("\t*   Welcome to HangMan Game   *");
        System.out.println("\t*******************************\n");

        System.out.print("Enter word to guess: ");
        word_ = scanner.nextLine().toUpperCase();

        char[] word = new char[word_.length()];
        for(int i=0; i<word_.length(); i++){
            word[i] = word_.charAt(i);
        }

        // for(char ch : word){
        //     System.out.print(ch + " ");
        // } System.out.println();

        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        for(int i=0; i<1000; i++){
            System.out.println();
        }

        char[] guessed = new char[word_.length()];
        for(int i=0; i<word_.length(); i++){
            guessed[i] = '_';
        }

        int wrongGuesses = 0;
        int guessedLetters = 0;

        char[] guessedLettersTotal = new char[26];
        int idx = 0;
        ArrayList<Character> letters = new ArrayList<>();


        while(wrongGuesses < 6 && guessedLetters < word_.length()){
            
            System.out.print("WORD: ");
            for(char ch : guessed){
                System.out.print(ch + " ");
            } 
            System.out.print("\n");
            System.out.println();

            Collections.sort(letters);
            System.out.print("Guessed Letters: [ ");
            for(char ch : letters){
                System.out.print(ch + " ");
            } System.out.println("]");

            System.out.print("Guess a letter: ");
            String guess = scanner.nextLine().toUpperCase();

            if(guess.length()!=1 || !Character.isLetter(guess.charAt(0))){
                System.out.println("Please Enter a single letter.\n");
                continue;
            }

            boolean skip = false;
            for(char ch : guessedLettersTotal){
                if (guess.charAt(0) == ch){
                    System.out.println("You've already guessed the letter " + ch + "! Try Again.\n");
                    skip = true;
                    break;
                }
            }
            if(skip) continue;

            

            guessedLettersTotal[idx++] = guess.charAt(0);
            letters.add(guess.charAt(0));

            // System.out.print("Gussed Letters : ");
            // for(char ch : guessedLettersTotal){
            //     System.out.print(ch + " ");
            // } System.out.println();


            System.out.println();

            if(word_.contains(guess)){

                System.out.println("Correct Guess!");

                for(int i=0; i<word_.length(); i++){
                    char ch = word_.charAt(i);
                    if (ch == guess.charAt(0)){
                        guessedLetters++;
                        guessed[i] = guess.charAt(0);
                    }
                }

            }

            else {
                System.out.println("Wrong Guess!");
                wrongGuesses++;
                hangmanArt(wrongGuesses);
            }

            // System.out.println("Guessed letters = " + guessedLetters);

        }

        if (wrongGuesses == 6){
            System.out.println();
            System.out.println("YOU LOST! The word was: " + word_);
            System.out.println("BETTER LUCK NEXT TIME!");
            System.out.println();
        }
        if (guessedLetters == word_.length()){
            System.out.println();
            System.out.println("YOU WON! The word was: " + word_);
            System.out.println("CONGRATULATIONS!");
            System.out.println();
        }

        scanner.close();

    }

    static void hangmanArt(int n){
        switch(n){
            case 1 -> {
                System.out.println("     ◯ ");     
                System.out.println("     ");
                System.out.println("     ");
            }
            case 2 -> {
                System.out.println("     ◯ ");
                System.out.println("     | ");
                System.out.println("     ");
            }
            case 3 -> {
                System.out.println("     ◯ ");
                System.out.println("    /|");
                System.out.println();
            }
            case 4 -> {
                System.out.println("     ◯ ");
                System.out.println("    /|\\");
                System.out.println("     ");
            }
            case 5 -> {
                System.out.println("     ◯ ");
                System.out.println("    /|\\");
                System.out.println("    /  ");
            }
            case 6 -> {
                System.out.println("     ◯ ");
                System.out.println("    /|\\   LMAO DEAD!");
                System.out.println("    / \\");
            }
        }
    }

}