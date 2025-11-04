import java.util.Scanner;

// Scott L. Parrish 11/3/2025
// SDEV 200 Module 1 Exercise 6.31
// CCValidator class a class to implement the Luhn Check algorithm
// to validate credit card numbers including example code demonstrating
// its use.
public class CCValidator {

    public static boolean isValid(long number) {
        String numberString = Long.toString(number);
        char[] charArray = numberString.toCharArray();

        System.out.println(charArray[charArray.length -2]);
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
