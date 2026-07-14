

	public class MedianOfThree {
	    public static void main(String[] args) {
	        int a = 15, b = 5, c = 10;
	        
	        // Logical breakdown checking which number falls middle-ground
	        int median = (a > b) ? 
	                     ((b > c) ? b : (a > c ? c : a)) : 
	                     ((a > c) ? a : (b > c ? c : b));

	        System.out.println("The median is: " + median);
	    }
	}

