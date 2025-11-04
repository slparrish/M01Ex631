public class CCValidator {

    public static boolean isValid(long number) {
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
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long ccnum = input.nextLong();
        if (isValid(ccnum)) {
            System.out.println(ccnum + " is valid");
        } else {
            System.out.println(ccnum + " is not valid");
        }
    }
}
