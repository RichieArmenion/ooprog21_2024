public class BloodData {
    private String bloodType;
    private String rhFactor;

    // Constructor that allows setting blood type and Rh factor
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // Default constructor that calls defaultPatient method
    public BloodData() {
        defaultPatient();
    }

    // Method to set default patient data (A and -)
    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    // Method to display the blood type and Rh factor
    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }

    // Setter for blood type
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // Setter for Rh factor
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Getter for blood type
    public String getBloodType() {
        return bloodType;
    }

    // Getter for Rh factor
    public String getRhFactor() {
        return rhFactor;
    }
}
