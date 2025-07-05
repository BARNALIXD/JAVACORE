public class ThirdLargestPrime {
    public static void main(String[] args) {
        int count = 0;

        // Loop from 1000 down to 2
        for (int num = 1000; num >= 2; num--) {
            boolean isPrime = true;

            // Check if num is prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Count prime numbers
            if (isPrime) {
                count++;
                if (count == 3) {
                    System.out.println("3rd largest prime number below 1000 is: " + num);
                    break;
                }
            }
        }
    }
}
