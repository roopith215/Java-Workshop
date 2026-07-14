import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int square = number * number;
            System.out.println("The square of " + number + " is: " + square);

            scanner.nextLine(); 

            while (true) {
                System.out.print("Do you want to continue? (YES/NO): ");
                choice = scanner.nextLine().trim();

                if (choice.equalsIgnoreCase("YES") || choice.equalsIgnoreCase("NO")) {
                    break; 
                } else {
                    System.out.println("Please enter Yes / No");
                }
            }

        } while (choice.equalsIgnoreCase("YES")); 

        System.out.println("Program finished. Goodbye!");
        scanner.close();
    }
}