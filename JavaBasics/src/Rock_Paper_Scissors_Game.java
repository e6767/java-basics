import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {
    public static void main (String [] args){

        //Welcome Message
        System.out.println("***************************************");
        System.out.println("Welcome to the Rock Paper Scissors Game");
        System.out.println("***************************************");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String [] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);
            if(playerChoice.equals(computerChoice)){
                System.out.println("Its a tie!");
            }else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You win!");

            }else{
                System.out.println("You lose");
            }
            System.out.print("Would you like to play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));


        System.out.println("********");
        System.out.println("Goodbye!");
        System.out.println("********");




        //declare variables
        //Get choice from user
        //Get random choice from computer
        //Check win condition
        //Ask to play again
        //Goodbye Message
    }
}
