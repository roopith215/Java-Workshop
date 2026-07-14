import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select a shape to find its area:");
        System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of Circle: " + circleArea);
                break;
                
            case 2:
                System.out.print("Enter side length of the square: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square: " + squareArea);
                break;
                
            case 3:
                System.out.print("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = sc.nextDouble();
                double rectArea = length * width;
                System.out.println("Area of Rectangle: " + rectArea);
                break;
                
            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = sc.nextDouble();
                double triArea = 0.5 * base * height;
                System.out.println("Area of Triangle: " + triArea);
                break;
                
            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
        }
        sc.close();
    }
}