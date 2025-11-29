import java.util.Scanner;

public class DonutShop {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int D;
        int E;
        int Q;
        int R = 0;
        char symbol = ' ';
        D = scanner.nextInt();
        E = scanner.nextInt();

        for (int i = 0; i < E; i++){
            R = D;
            symbol = scanner.next().charAt(0);
            Q = scanner.nextInt();

            if(symbol == '+') {
                R = R + Q;
            }
            if(symbol == '-'){
                R = R - Q;
            }

        }

        System.out.println(R);

    }
}
