public class CourseFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;               // Course fee
        int discountPercent = 10;       // Discount percentage

        // Calculate discount
        int discount = (fee * discountPercent) / 100;

        // Final price after discount
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount 
                           + " and final discounted fee is INR " + finalFee);
    }
}
