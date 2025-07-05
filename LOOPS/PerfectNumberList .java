// public class PerfectNumberList {
//     public static void main(String[] args) {
//         System.out.println("Perfect numbers between 1 and 1000 are:");

//         // Loop through numbers from 1 to 1000
//         for (int num = 1; num <= 1000; num++) {
//             int sum = 0;

//             // Find divisors of 'num' and calculate sum
//             for (int i = 1; i < num; i++) {
//                 if (num % i == 0) {
//                     sum += i;
//                 }
//             }

//             // Check if sum equals the number
//             if (sum == num) {
//                 System.out.println(num);
//             }
//         }
//     }
// }






import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find divisors and add
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if it's perfect
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}
