package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for the n variable: ");
		int n = sc.nextInt();
		
		double mean = 0;
		
		Products[] vect = new Products[n];
		
		for(int i = 0; i < n; i ++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
			mean = mean + vect[i].getPrice();
		}
		
		sc.close();
	}

}
