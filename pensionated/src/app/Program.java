package app;

import java.util.Locale;
import java.util.Scanner;

import entitites.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student[] rooms = new Student[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Name: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rooms[room] = new Student(nome, email);
		}
		
		for(int i = 0; i < n ; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
	}

}
