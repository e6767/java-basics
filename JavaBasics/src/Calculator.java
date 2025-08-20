import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double  num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println("Welcome to Eddie's calculator program");
        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter your second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("You cannot divide by 0. Please rerun the program");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("That is not a vaild operator! Please rerun the program");
                validOperation = false;
            }
        }
        if (validOperation) {
            System.out.println(result);
        }

        //System.out.println(firstLetter.toUpperCase() + restLetters);

    }
}
