package first_JavaProgram;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Java CruelWorld");
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 43;
		double renda = 4356.54;
		
		System.out.println(y);
		System.out.println("Good Afternoom Java World");
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", x);
		System.out.printf("Hi! My name is %s, I have %d years and I wanna %.2f to salary", nome, idade, renda);
		
		


	}

}
