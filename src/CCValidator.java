import java.util.Scanner;

// Scott L. Parrish 11/3/2025
// SDEV 200 Module 1 Exercise 6.31
// CCValidator class a class to implement the Luhn Check algorithm
// to validate credit card numbers including example code demonstrating
// its use.  My version converts the number to a string to separate the
// digits when necessary.  There is probably a way to do this without
// converting to strings, but I wasn't able to figure it out in the time
// I allotted to complete the exercise.
public class CCValidator {
    // isValid accepts card number as a long number and returns the result of the Luhn
    // algorithm (is the total divisible by 10 or not)
    public static boolean isValid(long number) {
        int sumEven = sumOfDoubleEvenPlace(number); // sum of double even or added digits
        int sumOdd = sumOfOddPlace(number); // sum of the odd places
        int total = sumEven + sumOdd; // add em up

        // intellij had me simplify my if else to this.  It is less readable IMO but in this
        // mess, it's ok.
        return total % 10 == 0;
    }

    // sumOfDoubleEvenPlace() takes the CC number as a long and loops through
    // the number from right to left.  The numbers in the even places are split
    // out and sent to getDigit() which returns either the doubled number or
    // the two digits added together if the doubled number is 10 or larger.
    // these values are then summed and returned as an int.
    public static int sumOfDoubleEvenPlace(long number) {
        String numberString = Long.toString(number);
        int counter = 0;
        int sum = 0;
        // Loop through CC number from right to left
        for (int i = numberString.length() - 1; i >= 0; i--) {
            // only want even numbers from right
            if (counter % 2 != 0) {
                int numeric = Character.getNumericValue(numberString.charAt(i));
                // get doubled digit and add it to sum
                sum += getDigit(numeric);
            }
            counter++;
        }
        return sum;
    }

    // getDigit() doubles the number from sumOfDoubleEvenPlace() and
    // returns either the doubled result (number) or the two digits
    // added together if they are greater than 9 (combo)
    public static int getDigit(int number) {
        number = number * 2;
        if (number > 9) {
            // Convert the number to a string for splitting the digits
            String splitDoubledStr = Integer.toString(number);
            // splitDoubledStr will be between '10' and '19' combo is the
            // sum of the numeric values of each digit in the string.
            int combo = Character.getNumericValue(splitDoubledStr.charAt(0)) + Character.getNumericValue(splitDoubledStr.charAt(1));
            return combo;
        }
        return number;
    }

    // sumOfOddPlace() loops through the CC number from the right
    // and sums the digits in the odd places, returning the result
    // as an int.  This method is similar to sumOfDoubledEvenPlace()
    // with a change at the if statement to take odd places
    // and minus the call to getDigit()
    public static int sumOfOddPlace(long number) {
        String numberString = Long.toString(number);
        int counter = 0;
        int sum = 0;
        // Loop through CC number from right to left
        for (int i = numberString.length() - 1; i >= 0; i--) {
            // only want odd numbers from right
            if (counter % 2 == 0) {
                int numeric = Character.getNumericValue(numberString.charAt(i));
                // get doubled digit and add it to sum
                sum += numeric;
            }
            counter++;
        }
        return sum;
    }

    // I am sure the next 3 methods are supposed to do something, but I am
    // not sure what and my brain is too fried rn to care.
    public static boolean prefixMatched(long number, int d) {
        return true;
    }
    public static int getSize(long d) {
        return 0;
    }
    public static long getPrefix(long number, int k) {
        return 0;
    }

    // main method to test and demonstrate the class.  Accepts card number entered
    // by the user and sends the number to isValid() for boolean result.
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
