package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("\nEnter rectangle width and height: ");
		retangulo.base = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		double area = retangulo.calculusArea();
		System.out.printf("\nAREA = %.4f", area);
		
		double perimeter = retangulo.calculusPerimeter();
		System.out.printf("\nPERIMETER = %.4f", perimeter);
		
		double diagonal = retangulo.calculusDiagonal();
		System.out.printf("\nDIAGONAL = %.4f", diagonal);
	}
}
