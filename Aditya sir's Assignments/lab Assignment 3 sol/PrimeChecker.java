public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n < 2) {
            System.err.println("Input value must be greater than or equal to 2.");
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int n = 7;
        boolean isNPrime = isPrime(n);
        System.out.println(isNPrime);
    }
}
