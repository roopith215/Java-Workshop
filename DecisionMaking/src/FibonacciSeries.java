// Wap to accept no. from user and print fibonacci series upto n-terms.

import java.util.Scanner;

public class FibonacciSeries {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int a=0,b=1,i=0;
	        System.out.println(a+" "+b);
	        for( i=3;i<=n;i++) {
	        int c=a+b;
	        System.out.println(" "+c);
	        a=b;
	        b=c;
	        }
}
}