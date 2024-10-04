import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for blood type and Rh factor
        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();

        // Create a BloodData object with user input
        BloodData userBloodData = new BloodData(bloodType, rhFactor);

        // Display the user blood info
        userBloodData.displayBloodInfo();
    }
}
