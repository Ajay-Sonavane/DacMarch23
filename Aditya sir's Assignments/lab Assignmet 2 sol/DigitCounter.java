import java.util.Scanner;
public class DigitCounter {
public static Scanner sc = new Scanner(System.in);
    public static int countDigits(int n) {
        if (n == 0) {
            return 1; 
        }

        int count = 0;
        while (n > 0) {
            n = n / 10; 
            count++;    
        }
        return count;
    }

    public static void main(String[] args) {
        int number =sc.nextInt();
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}