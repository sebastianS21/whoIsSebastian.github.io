/*Juan Sebastian Salazar
 * unit 3
 * This program takes string input from user and returns the string all in upper case and then all in lower case */

import java.util.Scanner;

public class text_editor {
	
	public static void main(String[] args) {
		
		Scanner textEditor = new Scanner(System.in);	
		String text, textToUpperCase, textToLowerCase;
		
		
		System.out.println("Please enter text: ");
		text = textEditor.next();
		
		textToUpperCase = text.toUpperCase();
		System.out.println(textToUpperCase);
		
		textToLowerCase = text.toLowerCase();
		System.out.println(textToLowerCase);	
		
		int x = 578;
		System.out.println("There are " + x + 5 + "\n" +"hens in the house");
		
		
		
	} // end of main()

} // end of class
