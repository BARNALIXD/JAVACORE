public class ThirdPrimeDoWhile {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;

        do {
            boolean isPrime = true;

            // Check if num is prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count == 3) {
                    System.out.println("3rd prime number is: " + num);
                    break;
                }
            }

            num++;
        } while (true); // Infinite loop with a break when found
    }
}
