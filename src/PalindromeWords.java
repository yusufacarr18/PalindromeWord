import java.util.Scanner;

public class PalindromeWords {
	public static void main(String[] args) {

		// With this program , we will find out if a word is a palindrome or not.
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the word you want to know whether it is palindrome or not : ");
		String word = input.nextLine();

		int low = 0;
		int high = word.length();
		boolean isPalindrome = true;

		while (low < high) {
			if (word.charAt(low) != word.charAt(high - 1)) {
				isPalindrome = false;

			}
			low++;
			high--;

		}
		
		if(isPalindrome) {
			System.out.println("'"+word+"' is a palindrome word.");
		}
		else {
			System.out.println("'"+word+"' is a NOT! palindrome word.");

		}
		
		
	}
}
