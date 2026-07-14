import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max3(a, b, c));
        scanner.close();
    }

    public static int max3(int a, int b, int c) {
        int maxAB = (a > b) ? a : b;
        return (maxAB > c) ? maxAB : c;
    }
}