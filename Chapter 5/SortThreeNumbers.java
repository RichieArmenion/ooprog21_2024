import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input three numbers
        System.out.println("Enter three numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the smallest, largest, and middle numbers
        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);
        int middle = num1 + num2 + num3 - smallest - largest;

        // Display numbers in ascending order
        System.out.println("Numbers in ascending order: " + smallest + ", " + middle + ", " + largest);

        // Display numbers in descending order
        System.out.println("Numbers in descending order: " + largest + ", " + middle + ", " + smallest);

        // Close scanner
        scanner.close();
    }
}
