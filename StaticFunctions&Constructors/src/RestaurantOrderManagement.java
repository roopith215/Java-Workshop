class RestaurantOrder {
    String item;
    int quantity;

    // Instance Initializer Block
    {
        System.out.println("New Order Started");
    }

    // Default constructor
    public RestaurantOrder() {
        this("Basic Water", 1);
    }

    // Constructor with food item
    public RestaurantOrder(String item) {
        this(item, 2); // Matching output example quantity
    }

    // Constructor with food item and quantity
    public RestaurantOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        System.out.println("Item: " + this.item);
        System.out.println("Quantity: " + this.quantity);
    }

    public static void main(String[] args) {
        new RestaurantOrder("Pizza");
    }
}