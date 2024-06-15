package first_JavaProgram;
import java.util.Scanner;

public class entrada_dados {
	public static void main(String[] arhgs) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);

		char p;
		p = sc.next().charAt(0);
		System.out.println("Você digitou: " + p);
		
		sc.close();
	}

}
