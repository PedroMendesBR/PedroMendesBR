package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class studingDoWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean repeat;
		
		
		do {
			System.out.println("What a number in celsius you want convert to fahreneit?");
			double celsius = sc.nextDouble();
			double fahrenheit = (9.0 * celsius / 5.0) + 32;
			System.out.printf("This number in fahrenheit is: %.2f \n", fahrenheit);
			System.out.printf("You want repeat the program? (true or false) \n");
			repeat = sc.nextBoolean();			
		} while (repeat != false);
		
		sc.close();
	}
}
