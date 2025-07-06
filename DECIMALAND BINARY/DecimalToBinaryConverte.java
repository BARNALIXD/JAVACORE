import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();  // Example: 10

        // Convert decimal to binary using built-in method
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary value: " + binary);
    }
}
