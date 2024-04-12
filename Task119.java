public class Task119{
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
	    return a * b;
	}
	public static double divide(double a, double b) {
	    return a / b;
    }

    public static void main (String[] args) {
        int result = Task119.add(56, 13);
            System.out.println("Sum: "+result);
        int result2 = Task119.subtract(17, 3);
            System.out.println("Difference: "+result2);
        int result3 = Task119.multiply(19, 8);
            System.out.println("Product: "+result3);
        double result4 = Task119.divide(15, 3);
            System.out.println("Quotient: "+result4);
    }
}
