import java.util.Scanner;

public class SumFormat {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (N): ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i);
            
            if (i < n) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }

        System.out.println(sum);
        
        scanner.close();
    }
}
