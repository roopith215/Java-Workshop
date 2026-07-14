class UserRegistration {
    String username;

    // Instance Initializer Block
    {
        System.out.println("Registration Process Started");
    }

    // Default Constructor
    public UserRegistration() {
        this("Guest");
    }

    // Parameterized Constructor
    public UserRegistration(String username) {
        this.username = username;
        System.out.println("Username: " + this.username);
        System.out.println("Account Created Successfully");
    }

    public static void main(String[] args) {
        new UserRegistration("Rahul");
    }
}