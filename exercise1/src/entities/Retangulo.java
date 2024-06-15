package entities;

public class Retangulo {
	public double base;
	public double altura;
	
	public double calculusPerimeter() {
		return ((base+altura)*2);
	}
	
	public double calculusArea() {
		return base*altura;
	}
	
	public double calculusDiagonal() {
		double d = Math.sqrt((altura*altura) + (base*base));
		return d;
	}
}
