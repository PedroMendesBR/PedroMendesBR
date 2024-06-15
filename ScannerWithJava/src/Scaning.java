import java.util.Scanner;

public class Scaning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Lend am string do tackled
		/*String name;
		name = sc.next();
		System.out.println("Você digitou o nome: " + name);
		
		int age;
		float sald;
		age = sc.nextInt();
		sald = sc.nextFloat();
		System.out.println("A idade do " + name +  " é: " + age + " e seu saldo é: " + sald);
		
		sc.close();*/
		
		/*-------------------------------------------------------------------*/
		
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
