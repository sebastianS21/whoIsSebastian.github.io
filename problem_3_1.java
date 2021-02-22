/*Juan Sebastian Salazar
 *Unit 3
 *The purpose of this program is two take two integers from user input and return their sum, difference and product*/


import  java.util.Scanner;

public class problem_3_1 {
	
	
	//Main method
	public static void main(String[] args) {
		
		Scanner calculations = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		int first_answer;
		int second_answer;
		int third_answer;
		
		System.out.println("please enter your first number: ");
		firstNumber = calculations.nextInt();
		
		System.out.println("Please enter your second number: ");
		secondNumber = calculations.nextInt();
		
		first_answer = firstNumber + secondNumber;
		System.out.println("The sum of your two numbers is: " + first_answer);
		
		second_answer = firstNumber - secondNumber;
		System.out.println("The difference between your two numbers is: " + second_answer );
		
		third_answer = firstNumber * secondNumber;
		System.out.println("The product of your two numbers is: " + third_answer);
			
		
	} // end of main()

} // end of class
