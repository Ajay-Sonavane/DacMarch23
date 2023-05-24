import java.util.Scanner;
public class FindLargest {
public static Scanner sc = new Scanner (System.in);

    public static int findLargest(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Input values must be non-negative");
        }

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        int a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
        int largest = findLargest(a, b, c);
        System.out.println(largest);
    }
}
