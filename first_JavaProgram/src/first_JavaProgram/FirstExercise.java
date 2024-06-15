package first_JavaProgram;

import java.util.Locale;

public class FirstExercise {
	public static void main(String[] args) {
		String product_one = "Computer";
		String product_two = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price_one = 2100.00;
		double price_two = 650.58;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f\n", product_one, price_one);
		System.out.printf("%s, which price is $%.2f\n", product_two, price_two);
		System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.printf("Measua with eight decimal pleaces: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f\n", measure);
		
	}
}
