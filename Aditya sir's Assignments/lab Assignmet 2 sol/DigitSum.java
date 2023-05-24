import java.util.Scanner;

public class DigitSum {
public static Scanner sc = new Scanner (System.in);

    public static int countDigitSum(int n) {
        int sum = 0;
        
        while (n != 0) {
            sum += n % 10;  // Get the last digit and add it to the sum
            n /= 10;       // Remove the last digit from the number
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = countDigitSum(n);
        System.out.println("Sum of digits: " + sum);
    }
}
