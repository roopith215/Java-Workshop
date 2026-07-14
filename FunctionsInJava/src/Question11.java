import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfN(n));
        scanner.close();
    }

    public static int sumOfN(int n) {
        if (n <= 1) return n;
        return n + sumOfN(n - 1);
    }
}