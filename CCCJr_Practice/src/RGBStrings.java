import java.util.Scanner;

public class RGBStrings {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        int numLetters;
        String rgb;
        int rgbNumbers;
        int firstPosOfR = -1;
        int firstPosOfB = -1;
        int firstPosOfG = -1;
        int numOfG = 0;
        System.out.print("Enter the amount of letters in your string: ");
        numLetters = scanner.nextInt();
        System.out.print("Enter your String: ");
        rgb = scanner.next();
        for (int i = 0; i < numLetters; i++){
            char rgbLetter = rgb.charAt(i);
            if (rgbLetter =='R' && firstPosOfR == -1) {
                firstPosOfR = i;

            } else if (rgbLetter == 'B' && firstPosOfB == -1){
                firstPosOfB = i;
            } else if (rgbLetter == 'G'){
                firstPosOfG = i;
                numOfG ++;
            }
            if(firstPosOfG > firstPosOfR && firstPosOfG < firstPosOfB && numOfG == 1 && firstPosOfB > firstPosOfR) {
                System.out.println("RGB FOUND");
                break;
            }




        }



        //RRGAB Find the first R in the string by checking each letter in the string by assigning them to a variable and checking the variables value, then find the last B in the string, then check if there is a G inside.
        //
        //RAGB
        //RGGB
        //GRGB
        //GRGBG
        //GRAAAB
        //To find the RGB words you need to have the word start with R, end with B and only have one G inside it



    }
}
