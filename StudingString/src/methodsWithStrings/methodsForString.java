package methodsWithStrings;

public class methodsForString {
	public static void main(String[] args) {
		String original = "Minha pica flamejante";
		String n1 = original.toLowerCase();
		String n2 = original.toUpperCase();
		String n3 = original.trim();
		String n4 = original.substring(4);
		String n5 = original.substring(4, 10);
		String n6 = original.replace("pica", "xer3c@");

	
		System.out.println("Original..." + original);
		System.out.println("LowerCase..." + n1);
		System.out.println("UpperCase..." + n2);
		System.out.println("trim..." + n3);
		System.out.println("substring at char 4..." + n4);
		System.out.println("substring at char 4 for char 10..." + n5);
		System.out.println("replace..." + n6);
	}
}
