import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//CREDIT GOES TO VLADAMIR FOR HELPING US AND HAVING EXTREME PATIENCE AND KINDESS//

        Scanner scanner = new Scanner(System.in);

        int hexidecimalAnswer = 0;
        long decimal = 0;





        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();
        hex = hex.toLowerCase();

        if ( hex.substring(0,2).equals("0x")) {
            hex = hex.substring(2);
        }
        for (int i = 0; i < hex.length(); i ++) {
            char myChar = hex.charAt(i);
            int num = 0;
            if (myChar >= 48 && myChar <= 57) {
                num = myChar - 48;
            } else {
                num = myChar - 87;
            }
            int pow = hex.length() - i - 1;
            decimal += num * Math.pow(16, pow);
        }
            System.out.println("Your number is " + decimal + " in decimal");

        }


    }


