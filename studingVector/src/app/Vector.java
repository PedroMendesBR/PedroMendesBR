package app;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value for n variable: ");
		int n = sc.nextInt(); 
		
		double[] vector = new double[n];
		double mean = 0;
		
		for(int i = 0; i < n; i++) {
			vector[i] = sc.nextDouble();
			mean = mean + vector[i];
		}
		
		System.out.println("The mean of the values in the vector is: " + mean/3);

		sc.close();
		
	}

}
