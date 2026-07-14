

	public class DaysToWeeks {
	    public static void main(String[] args) {
	    	java.util.Scanner sc = new java.util.Scanner(System.in); // Basic Scanner input
	        System.out.print("Enter total number of days: ");
	        int totalDays = sc.nextInt();

	        int weeks = totalDays / 7;
	        int remainingDays = totalDays % 7;

	        System.out.println(totalDays + " days = " + weeks + " week(s) and " + remainingDays + " day(s).");
	        sc.close();
	    }
	}

