import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args){

        System.out.println("\n*****************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("*****************************\n");

        String[] questions = {  "What is the main feature of a router?",
                                "Which part of the computer is considered the brain?",
                                "What year was FaceBook launched?",
                                "Who is known as the father of computer?",
                                "What was the first programming language?"
                            };

        String[][] options = { {"1. Storing files", "2. Encrypting Data", "3. Directing internet traffic", "4. Managing passwords"},
                               {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                               {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                               {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                               {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"} 
                            };

        int[] correctAnswers = {3, 2, 1 ,4 ,3};

        int[] guesses = new int[5];
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            for(int j=0; j<options[0].length; j++){
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer (1/2/3/4) : ");
            guesses[i] = scanner.nextInt();
            if (guesses[i] == correctAnswers[i]){
                System.out.println("\n*******");
                System.out.println("CORRECT");
                System.out.println("*******\n");
                score++;
            }
            else {
                System.out.println("\n*****");
                System.out.println("WRONG");
                System.out.println("*****\n");
            }
        }

        System.out.println("YOUR FINAL SCORE IS " + score + "/5\n");

        scanner.close();

    }

}