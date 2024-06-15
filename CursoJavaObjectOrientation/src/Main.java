import java.util.Locale;


public class Main {
	public static void main(String[] args) {
		double x = 45.666432;
		int y = 32;
		String nome = "Pedro";
		int idade = 21;
		double renda = 700;
		
		
		/*Diferenças de exibição em console no Java*/


		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.println(y);
		System.out.printf("This is print with formatation. This is value a y variable: %.4f\n", x);
		
		System.out.printf("%s tem %d anos de idade e recebe %.2f reais por mês", nome, idade, renda);
	}
}
