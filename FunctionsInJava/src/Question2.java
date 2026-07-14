import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isEven(n));
        scanner.close();
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}