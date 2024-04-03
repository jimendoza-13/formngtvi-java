import java.util.Scanner;

public class taskSheet1_1_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		    System.out.println("Enter a Word: ");
		
		String string1 = input.nextLine();
		StringBuilder word1 = new StringBuilder(string1);
		    System.out.println(string1.toString());
	
		//Use StringBuilder to create a new string that is a reverse of the input string.
		StringBuilder word2 = word1.reverse();
		    System.out.println(word2.toString());
		
		//Use the equals() method to check if the input string and the reversed string are the same.
		if (string1.equals(word2.toString())){
		    System.out.println("The input string is a palindrome.");
		}

        else {
		    System.out.println("The input string is not a palindrome.");
	}
    }
}
