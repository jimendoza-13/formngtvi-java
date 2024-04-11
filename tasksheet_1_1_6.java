import java.util.Scanner;

	public class tasksheet_1_1_6 {
		public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = in.nextInt();
	        System.out.print("Enter second number: ");
	        int b = in.nextInt();
	        System.out.print("Enter third number: ");
	        int c = in.nextInt();
	        
	        if (a == b && b == c) {
	            System.out.println("All the numbers are equal");
	        }
	        else {
	            int largest = a;
	            
	            if (b > largest)
	                largest = b;
	                
	            if (c > largest)
	                largest = c;
	                
	            System.out.println("The largest number is: " + largest);
	        }
	    }
	}
