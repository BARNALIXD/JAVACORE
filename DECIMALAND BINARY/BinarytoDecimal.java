import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();

        int decimal = Integer.parseInt(binaryString, 2);

        System.out.println("The decimal equivalent is: " + decimal);}
}