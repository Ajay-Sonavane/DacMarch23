import java.util.Scanner;
public class DigitCounter1 {
public static Scanner sc = new Scanner (System.in);
    public static void countEvenAndOddDigits(int n) {
        int evenCount = 0;
        int oddCount = 0;

        if (n == 0) {
            oddCount = 1; // Special case for zero
        }

        while (n > 0) {
            int digit = n % 10; // Extract the rightmost digit

            if (digit % 2 == 0) {
                evenCount++; // Increment even count for even digit
            } else {
                oddCount++; // Increment odd count for odd digit
            }

            n = n / 10; // Remove the rightmost digit
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }

    public static void main(String[] args) {
        int number = sc.nextInt();
        countEvenAndOddDigits(number);
    }
}
