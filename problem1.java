/*Sebastian Salazar
 * unit 5.1
 * The purpose of this program is to compare two strings to see if they match.  */


import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		
		Scanner nameComparison = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String name1 = nameComparison.next();
		
		System.out.println("Enter second name");
		String name2 = nameComparison.next();
		
		if(name1.equals(name2)){
			
			System.out.println("names are the same");
			
		}else {
			
			String firstName = name1.toUpperCase();
			String secondName = name2.toUpperCase();
			
			if(firstName.equals(secondName)){
				
				System.out.println("names are equal if CASE is ignored");
				
			}else {
				
				System.out.println("names are not equal");
			}
			
		}
		
	}// end of main()

}// end of class
