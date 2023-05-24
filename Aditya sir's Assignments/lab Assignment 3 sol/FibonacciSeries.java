public class FibonacciSeries {
    public static String generateFibonacciSeries(int n) {
        if (n < 0) {
            return "Error: Input value must be non-negative.";
        }

        StringBuilder series = new StringBuilder();
        int num1 = 0;
        int num2 = 1;

        series.append(num1);

        if (n > 0) {
            series.append(" ").append(num2);
        }

        for (int i = 2; i < n; i++) {
            int nextNum = num1 + num2;
            series.append(" ").append(nextNum);
            num1 = num2;
            num2 = nextNum;
        }

        return series.toString();
    }

    public static void main(String[] args) {
        int n = 6;
        String fibonacciSeries = generateFibonacciSeries(n);
        System.out.println(fibonacciSeries);
    }
}
