import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Leap year logic packed into a ternary condition
        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
                        ? year + " is a leap year." 
                        : year + " is not a leap year.";
        
        System.out.println(result);
        sc.close();
    }
}