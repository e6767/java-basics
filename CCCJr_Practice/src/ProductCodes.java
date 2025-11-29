import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProductCodes {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int N;
        String code;

        N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            code = scanner.next();
            StringBuilder newCodeSB = new StringBuilder();
            int sum = 0;
            for(int j = 0; j < code.length(); j++){
                    char c = code.charAt(j);

                        boolean upperCase = Character.isUpperCase(c);
                        if(upperCase){
                            newCodeSB.append(String.valueOf(c));
                        }
                        else if(Character.isLowerCase((c))) {

                        } else if(Character.isDigit(c) || (c == '-')){
                            //System.out.println("C: " + c);
                            int start = j;
                           // System.out.println("Start: " + start);


                            int k;
                            for ( k = j + 1; k < code.length(); k++ ){
                                if (!Character.isDigit(code.charAt(k))){

                                    break;
                                }
                               // System.out.println("K: " + k);



                            }
                            String digits = code.substring(start, k );
                           // System.out.println("Digits: " + digits);
                            int value = Integer.parseInt(digits);
                            //System.out.println("Value: " + value);

                            sum += value;
                            j = k -1;




                    }




            }
            newCodeSB.append(String.valueOf(sum));
            System.out.println(newCodeSB.toString());

            }

        }
    }

/*
Ahkiy-6ebvXCV1
393hhhUHkbs5gh6QpS-9-8
PL12N-2G1234Duytrty8-86tyaYySsDdEe

*/