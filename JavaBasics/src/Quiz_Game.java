import java.util.Arrays;
import java.util.Scanner;

public class Quiz_Game {
    public static void main (String [] args){

        String [] question = {"Q1. Which of the following is NOT a Java primitive data type?",
                "Q2. What is the default value of a boolean variable in Java (if it is a class member)?",
                "Q3. Which keyword is used to prevent a class from being subclassed?",
                "Q4. What does the == operator compare when used with objects in Java?",
                "Q5. Which method is always called when an object is created in Java?"};
        String[][] options = {{"1. Int","2. Boolean","3. String","4. Double"},
                               {"1. True","2. False", "3. 0","4. Nil"},
                               {"1. Final","2. Static","3. Private","4. Abstract"},
                               {"1. The contents of the objects","2. The memory addresses","3. The string length","4. The hash code values"},
                               {"1. Start()", "2.Init()", "Main()", "Constructor()"}};

        int [] answers = {3,2,1,2,4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");

        for(int i = 0; i < question.length; i++){
            System.out.println(question[i]);

            for(String option : options[i]){
                System.out.println(option);

            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                score ++;
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");

            }else{
                System.out.println("*********");
                System.out.println("INCORRECT");
                System.out.println("*********");
            }

        }
        System.out.println("You got " + score + "/" + question.length + " correct!");
        System.out.println("The answer key was " + Arrays.toString(answers));


        scanner.close();
    }

}
