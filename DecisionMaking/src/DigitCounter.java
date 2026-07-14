
import java.util.Scanner;
	public class DigitCounter {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        int temp = Math.abs(number); 
	        int count = 0;
	        
	        if (temp == 0) {
	            count = 1;
	        }
	        
	        while (temp > 0) {
	            temp = temp / 10;
	            count++;
	        }
	        
	        System.out.println("The number of digits is: " + count);
	        
	        sc.close();
	    }
	}

