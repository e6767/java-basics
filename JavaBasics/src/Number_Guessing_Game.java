import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 1000;
        int randomNumber = random.nextInt(min,max);

        System.out.println("Number Guessing game");
        System.out.println("Guess a number between 1-1000");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;

            if(guess < randomNumber){
                System.out.println("Number is too low");
            }else if(guess > randomNumber){
                System.out.println("Number is too high");
            }else{
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("It took you " + attempts + " attempts");
            }

        }while(guess != randomNumber);


    }
}
