import java.util.Scanner;

public class GreatestOfFourNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                if (a >= d) {
                    System.out.println(a + " is greatest.");
                } else {
                    System.out.println(d + " is greatest.");
                }
            } else {
                if (c >= d) {
                    System.out.println(c + " is greatest.");
                } else {
                    System.out.println(d + " is greatest.");
                }
            }
        } else {
            if (b >= c) {
                if (b >= d) {
                    System.out.println(b + " is greatest.");
                } else {
                    System.out.println(d + " is greatest.");
                }
            } else {
                if (c >= d) {
                    System.out.println(c + " is greatest.");
                } else {
                    System.out.println(d + " is greatest.");
                }
            }
        }
        sc.close();
    }
}