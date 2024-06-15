package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int number = sc.nextInt();
		int[] vetorNumeros = new int[number];
		
		for(int i=0; i < number; i++) {
			System.out.println("Digite um numero: ");
			vetorNumeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos");
		for(int i = 0; i < number; i++) {
			if(vetorNumeros[i] < 0) {
				System.out.println(vetorNumeros[i]);
			}
		}
	}

}
