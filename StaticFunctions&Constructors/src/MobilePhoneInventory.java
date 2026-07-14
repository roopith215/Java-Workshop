class MobileInventory {
    String brand;
    String model;
    double price;

    // Instance Initializer Block
    {
        this.brand = "Samsung";
        System.out.println("Inventory Entry Started");
    }

    // Default constructor
    public MobileInventory() {
        this("Basic Model", 0.0);
    }

    // Constructor with model
    public MobileInventory(String model) {
        this(model, 65000.0); // Matching output example price
    }

    // Constructor with model and price
    public MobileInventory(String model, double price) {
        this.model = model;
        this.price = price;
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + (int)this.price);
    }

    public static void main(String[] args) {
        new MobileInventory("S24");
    }
}