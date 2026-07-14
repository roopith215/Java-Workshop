

	public class CheckNumberSign {
	    public static void main(String[] args) {
	        int num = 0;
	        String type = (num > 0) ? "Positive" : ((num < 0) ? "Negative" : "Zero");
	        System.out.println("The number is: " + type);
	    }
	}

