package app;

import java.util.Locale;
import java.util.Scanner;

import utils.Dolar;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many dollars will be bought?");
		double dollarsBuy = sc.nextDouble();
		
		System.out.println("What is the dollar price?");
		double dolarValue = sc.nextDouble();
		
		System.out.printf("\nAmount to be paid in reais = %.2f", Dolar.dolarConvert(dolarValue, dollarsBuy));
	
		sc.close();
		
	}
}
