/* Juan Sebastian Salazar
 * unit 4 
 * The purpose of this program is to take input from the user (test score) and output the test score along with the corresponding grade (A, B, C, D, F) */

import java.util.Scanner;

public class testScores {
	
	
	public static void main(String[] args) {
		
		Scanner gradeCalculator = new Scanner(System.in);
		int testScore;
		
		System.out.println("Enter your score: ");
		testScore = gradeCalculator.nextInt();
		
		if (testScore >= 90) {
			System.out.println("test score of " + testScore + ": A");
		}else if(testScore >= 80) {
			System.out.println("test score of " + testScore + ": B");
		}else if(testScore >= 70) {
			System.out.println("test score of " + testScore + ": C");
		}else if(testScore >= 60) {
			System.out.println("test score of " + testScore + ": D");
		}else {
			System.out.println("test score of " + testScore + ": F");
		}
		
		
	}// end of main method 
	
	
}
