import java.util.Scanner;

public class RollerCoasterRide {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N;
        int C;
        int P;

       N = scanner.nextInt();
       C = scanner.nextInt();
       P = scanner.nextInt();

       if (C*P>=N ){
           System.out.println("yes");

       }
       else{
           System.out.println("no");
       }
    }
}
