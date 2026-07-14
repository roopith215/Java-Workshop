import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDigits(n));
        scanner.close();
    }

    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}