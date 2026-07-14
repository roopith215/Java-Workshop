import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a, b));
        scanner.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}