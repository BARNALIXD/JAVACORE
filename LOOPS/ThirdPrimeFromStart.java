public class ThirdPrimeFromStart {
    public static void main(String[] args) {
        int count = 0;

        // Start checking from 2 upwards
        for (int num = 2; ; num++) {
            boolean isPrime = true;

            // Check if num is prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Count the prime
            if (isPrime) {
                count++;
                if (count == 3) {
                    System.out.println("3rd prime number from start is: " + num);
                    break;
                }
            }
        }
    }
}
