package utils;

public class Dolar {
	public static double dolarConvert(double dolarValue, double dollarsBuy) {
		return (dollarsBuy+(dollarsBuy*0.06))*dolarValue;
	}
}
