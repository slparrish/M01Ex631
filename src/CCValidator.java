import java.util.Scanner;

// Scott L. Parrish 11/3/2025
// SDEV 200 Module 1 Exercise 6.31
// CCValidator class a class to implement the Luhn Check algorithm
// to validate credit card numbers including example code demonstrating
// its use.
public class CCValidator {

    public static boolean isValid(long number) {
        String numberString = Long.toString(number);
        //System.out.println(numberString.length());
        int counter = 0;
        for (int i = numberString.length() - 1; i >= 0; i--) {

            if (counter % 2 != 0) {
                System.out.println(numberString.charAt(i));
                int numeric = Character.getNumericValue(numberString.charAt(i));
                numeric = numeric * 2;
                System.out.println("doubled " + numeric);
                if (numeric > 9) {
                    String splitDoubledStr = Integer.toString(numeric);
                    int combo = Character.getNumericValue(splitDoubledStr.charAt(0)) + Character.getNumericValue(splitDoubledStr.charAt(1));
                    System.out.println("combo " + combo);
                }

            }
            counter++;
        }
        return true;
    }
    public static int sumOfDoubleEvenPlace(long number) {
        return 0;
    }
    public static int getDigit(int number) {
        return 0;
    }
    public static int sumOfOddPlace(long number) {
        return 0;
    }
    public static boolean prefixMatched(long number, int d) {
        return true;
    }
    public static int getSize(long d) {
        return 0;
    }
    public static long getPrefix(long number, int k) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else {
            System.out.println(cardNumber + " is not valid");
        }
    }
}
