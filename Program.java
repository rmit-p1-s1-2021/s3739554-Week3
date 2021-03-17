/*
 * Programming 1 @RMIT
 * 
 * @author mehmetalikir
 * 
 */

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter two Strings
		System.out.print("Enter 1st character : ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2st character : ");
		String str2 = sc.nextLine();
		// Prompt the user to enter an integer
		System.out.print("Enter number of lines : ");
		int line = sc.nextInt();
		// will be use for swapping algorithm
		String temp;
		// Display pyramid
		for (int i = 0; i < line; i++) {
			// Create numbers in each row
			for (int j = i + 1; j > 0; j--) {
				System.out.print(str1 + " ");
				// swapping strings
				temp = str1;
				str1 = str2;
				str2 = temp;
			}
			// End line
			System.out.println();

		}
		// close scanner function/method
		sc.close();
	}
}
