import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isArmstrong(n));
        scanner.close();
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int temp = n;
        int digits = 0;
        
        if (n == 0) digits = 1;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        int sum = 0;
        n = original;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }
}