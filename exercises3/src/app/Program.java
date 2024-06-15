package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the name of this student:");
		student.name = sc.nextLine();
		
		student.trimestre1 = sc.nextDouble();
		student.trimestre2 = sc.nextDouble();
		student.trimestre3 = sc.nextDouble();
		
		double desempenho = student.notaFinal();
		
		if(desempenho > 60) {
			student.approved();
		} else {
			student.reproved();
		}
		
		System.out.println(student.name + ", "
				+ student.trimestre1 + ", "
				+ student.trimestre2 + ", "
				+ student.trimestre3);
	}

}
