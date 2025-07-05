public class AlternatePrime {
    public static void main(String[] args) {
        int num = 2;
        int primeCount = 0;
        int printedCount = 0;

        while (printedCount < 10) {  // Print first 10 alternate primes
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;
                // Print only alternate (odd count) primes
                if (primeCount % 2 != 0) {
                    System.out.print(num + " ");
                    printedCount++;
                }
            }
            num++;
        }
    }
}
