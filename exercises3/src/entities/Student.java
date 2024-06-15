package entities;

public class Student {
	public String name;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	
	public double notaFinal() {
		return trimestre1 + trimestre2 + trimestre3;
	}
	
	public void approved() {
		System.out.println("Congratulations. You approved in this class " + notaFinal());
	}
	
	public void reproved() {
		System.out.println("I'm sorry. You reproved in this class " + notaFinal());
	}
}
