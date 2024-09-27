class Billing {
  
    public void computeBill(double price) {
        double total = price + (price * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
    }

    public void computeBill(double price, int quantity) {
        double total = price * quantity;
        total = total + (total * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
    }

    public void computeBill(double price, int quantity, int coupon) {
        double total = price * quantity;
        total = total - coupon;
        total = total + (total * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void main(String[] args) {
        Billing bill = new Billing();

        bill.computeBill(23.2); 
        bill.computeBill(23.2, 2); 
        bill.computeBill(23.2, 3, 10); 
    }
}
