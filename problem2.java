/* Juan Sebastian Salazar
 * unit 5 problem 2
 * the purpose of this program is to  This program aims to take three strings (input from the user) and order them in alphabetical order. 
 * However, we are not to use any sorting utilities that exist in Java, such as Arrays.sort() or TreeSet<String>. */

import java.util.Scanner;

public class problem2 {
	
	public static void main(String[] args) {
		
		Scanner order = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String name1 = order.next();
		
		System.out.println("Enter second name:");
		String name2 = order.next();
		
		System.out.println("Enter third name:");
		String name3 = order.next();
		
		int compareOnetotwo = name1.compareTo(name2);
		int compareOnetoThree = name1.compareTo(name3);
		
		int comparetwotoOne = name2.compareTo(name1);
		int compareTwotoThree = name2.compareTo(name3);
		
		int comparethreetoOne = name3.compareTo(name1);
		int compareThreetotwo = name3.compareTo(name2);
		
		
		if(compareOnetotwo < 0 && compareOnetoThree < 0) {
			
			
			if( compareTwotoThree < 0) {
				System.out.println("The FIRST name is: " + name1 + ", the SECOND name is: " + name2 + ", THIRD name is: " + name3);
			}else {
				System.out.println("The FIRST name is: " + name1 + ", the SECOND name is: " + name3 + ", THIRD name is: " + name2);
			}
			
			
		}else if(comparetwotoOne < 0 && compareTwotoThree < 0) {
			
			if(compareOnetoThree < 0 ) {
				System.out.println("The FIRST name is: " + name2 + ", the SECOND name is: " + name1 + ", THIRD name is: " + name3);
			}else {
				System.out.println("The FIRST name is: " + name2 + ", the SECOND name is: " + name3 + ", THIRD name is: " + name1);
			}
			
		}else if(comparethreetoOne < 0 && compareThreetotwo < 0) {
			
			if(compareOnetotwo < 0) {
				System.out.println("The FIRST name is: " + name3 + ", the SECOND name is: " + name1 + ", THIRD name is: " + name2);
			}else {
				System.out.println("The FIRST name is: " + name3 + ", the SECOND name is: " + name2 + ", THIRD name is: " + name1);
			}
		}
		
	}// end of main

}// end of class
