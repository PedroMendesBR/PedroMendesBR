package app;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("\nCircumference: %.4f\n", c);
		System.out.printf("\nVolume: %.4f\n", v);
		System.out.printf("\nPI value: %f", Calculator.PI);
		
		sc.close();
	}
}
