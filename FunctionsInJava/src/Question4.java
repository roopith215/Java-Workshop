import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(max(a, b));
        scanner.close();
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}