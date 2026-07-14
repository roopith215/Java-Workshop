

	public class SwapWithoutTemp {
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        System.out.println("Before swap: a = " + a + ", b = " + b);

	        a = a + b; // a becomes 30
	        b = a - b; // b becomes 10 (30 - 20)
	        a = a - b; // a becomes 20 (30 - 10)

	        System.out.println("After swap: a = " + a + ", b = " + b);
	    }
	}

