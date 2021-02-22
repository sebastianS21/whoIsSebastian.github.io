/*Juan Sebastian Salazar
 * unit 4
 * The purpose of this program is to calculate the shipping cost of an item. The weight is provided by the user */
import java.util.Scanner;
public class shippingCost {
	

	public static void main(String[] args) {
		
		Scanner weightCalculator = new Scanner(System.in);
		double weight;
		
		System.out.println("Enter the weight of your package:");
		weight = weightCalculator.nextDouble();
		
		if(weight <= 5) {
			double firstShippingCost = weight * 1.20;
			System.out.println("Your package weight is " + weight + ", the cost of shipping is $" + firstShippingCost);
		}else if( weight > 5 && weight <= 10) {
			double secondShippingCost = weight * 1.00;
			System.out.println("Your package weight is " + weight + ", the cost of shipping is $" + secondShippingCost);
		}else if(weight > 10 && weight <= 20) {
			double thirdShippingCost = weight * 0.90;
			System.out.println("Your package weight is " + weight + ", the cost of shipping is $" + thirdShippingCost);
		}else {
			double shippingCost = weight * 0.80;
			System.out.println("Your package weight is " + weight + ", the cost of shipping is $" + shippingCost);
		}
		
	}// end of main
	
	
}

