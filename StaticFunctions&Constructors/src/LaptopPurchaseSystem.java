class LaptopPurchase {
    String warranty;
    String model;
    double price;

    // Instance Initializer Block
    {
        this.warranty = "1 Year";
        System.out.println("Purchase Initialized");
    }

    // Default constructor
    public LaptopPurchase() {
        this("Generic Model", 0.0);
    }

    // Constructor with model
    public LaptopPurchase(String model) {
        this(model, 55000.0); // Matching output example price
    }

    // Constructor with model and price
    public LaptopPurchase(String model, double price) {
        this.model = model;
        this.price = price;
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + (int)this.price);
        System.out.println("Warranty: " + this.warranty);
    }

    public static void main(String[] args) {
        new LaptopPurchase("Dell Inspiron");
    }
}