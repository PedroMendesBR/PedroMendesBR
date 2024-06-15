package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		
		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
			
		Product product = new Product(name, price);
		
		product.setName("Computer");
		
		System.out.println("Updated product name: " + product.getName());
		
		product.setPrice(1200.00);
		
		System.out.println("Updated product price: " + product.getPrice());
		
		sc.close();

	}

}
