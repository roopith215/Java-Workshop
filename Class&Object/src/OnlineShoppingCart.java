class ShoppingCart {
    private String productName;
    private double price;
    private int quantity;

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters & Logic
    public double getFinalPayableAmount() {
        double total = price * quantity;
        if (total > 5000) {
            total -= total * 0.10; // 10% discount
        }
        return total;
    }
}

public class  OnlineShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setProductName("Running Shoes");
        cart.setPrice(3000);
        cart.setQuantity(2); // Total = 6000

        System.out.println("Final Payable Amount: ₹" + cart.getFinalPayableAmount());
    }
}