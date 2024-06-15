
public class JavaWithMath {
	public static void main(String[] args) {
		double x = 4.0;
		double y = 3.2;
		double z = -1.4;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.pow(x,x);
		C = Math.abs(z);
		
		System.out.println("A raíz quadrada de " + x + " é igual: " + A);
		System.out.println("O número " + x + " elevado a " + x + " é igual: " + B);
		System.out.println("O módulo de " + z + " é igual a: " + C);
	}
}
