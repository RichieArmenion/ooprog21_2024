public class getAddress {
    public static void main(String[] args) {
        System.out.println("First Java application");

        String[] phoneBrands = {"Cloudfone"};

        for (String brand : phoneBrands) {
            System.out.println("Company: " + brand + "\n" + getAddress(brand));
        }
    }

    public static String getAddress(String brand) {
        String address;
        switch (brand) {
            case "Cloudfone":
                address = "Mandaue";
                break;
            default:
                address = "Address not found";
        }
        return address;
    }
}
