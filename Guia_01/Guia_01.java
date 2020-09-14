import IO.*;

/**
 * Arquitetura de Computadores I - Guia_01. Compilar com: javac -cp ./;IO.jar
 * Guia_01.java Executar com: java -cp ./;IO.jar Guia_01 Nome: Helton Reis
 * Matricula: 669678
 */
public class Guia_01 {
	/*
	 * Converter valor decimal para binario.
	 * 
	 * @return binario equivalente
	 * 
	 * @param value - valor decimal
	 */
	public static String dec2bin(int value) {
		String binary = "";
		int[] binary_number = new int[16];

		int index = 0;
		while (value > 0) {
			binary_number[index++] = value % 2;
			value = value / 2;
		}

		for (int i = binary_number.length; i >= 0; i--) {
			binary += binary_number[i].toString;
		}

		return binary;
	} // end dec2bin ( )

	/*
	 * Converter valor binario para decimal.
	 * 
	 * @return decimal equivalente
	 * 
	 * @param value - valor binario
	 */

	public static int bin2dec(String value) {
		StringBuilder sb = new StringBuilder(s);
		char[] reverseValue = sb.reverse().toString().toCharArray();

		int decimal = 0;

		for (int i = 0; i < reverseValue.length; i++) {
			decimal += Math.pow(Double.parseInt(Character.toString(reverseValue[i]), 2));
		}

		return decimal;
	} // end bin2dec ( )

	/*
	 * Converter valor decimal para base indicada.
	 * 
	 * @return base para a conversao
	 * 
	 * @param value - valor decimal
	 */

	public static String dec2base(int value, int base) {
		String onBase = "";
		int[] onBase_number = new int[16];

		int index = 0;
		while (value > 0) {
			onBase_number[index++] = value % base;
			value = value / base;
		}

		for (int i = onBase_number.length; i >= 0; i--) {

			switch (onBase_number[i]) {
			case 10:
				onBase += "A";
				break;

			case 11:
				onBase += "B";
				break;

			case 12:
				onBase += "C";
				break;

			case 13:
				onBase += "D";
				break;

			case 14:
				onBase += "E";
				break;

			case 15:
				onBase += "F";
				break;

			default:
				onBase += onBase_number[i];
				break;
			}

		}

		return onBase;
	} // end dec2base ( )

	/*
	 * Converter valor binario para base indicada.
	 * 
	 * @return valor equivalente na base indicada
	 * 
	 * @param value - valor binario
	 * 
	 * @param base - para a conversao
	 */

	public static String bin2base(String value, int base) {
		int decimalValue = bin2dec(value);
		String onBase = dec2base(decimalValue, base);

		return onBase;
	} // end bin2base ( )

	/*
	 * Converter valor em ASCII para hexadecimal.
	 * 
	 * @return hexadecimal equivalente
	 * 
	 * @param value - caractere(s) em codigo ASCII
	 */
	public static String ASCII2hex(String value) {
		char[] valueCharArray = asciiStr.toCharArray();

		StringBuilder builder = new StringBuilder();

		for (char c : valueCharArray) {
			builder.append(Integer.toHexString((int) c));
		}

		return builder.toString();
	} // end ASCII2hex ( )

	/*
	 * Converter valor em hexadecimal para ASCII.
	 * 
	 * @return caractere(s) em codigo ASCII
	 * 
	 * @param value - hexadecimal equivalente(s)
	 */
	public static String hex2ASCII(String value) {
		StringBuilder builder = new StringBuilder("");

		for (int i = 0; i < value.length(); i += 2) {
			String str = value.substring(i, i + 2);
			builder.append((char) Integer.parseInt(str, 16));
		}

		return builder.toString();
	} // end hex2ASCII ( ) Obs.: Inspirado da internet

	/*
	 * Acao principal.
	 */

	public static void main(String[] args) {
		IO.println("Guia_01 - Java Tests");
		IO.println("Nome: ________ Matricula: ________ ");
		IO.println();
		IO.equals(dec2bin(25), "10101");
		IO.equals(dec2bin(50), "10101");
		IO.equals(dec2bin(713), "10101");
		IO.equals(dec2bin(125), "10101");
		IO.equals(dec2bin(365), "10101");
		IO.println("1. errorTotalReportMsg = " + IO.errorTotalReportMsg());
		IO.equals(bin2dec("11001"), 0);
		IO.equals(bin2dec("10110"), 0);
		IO.equals(bin2dec("100101"), 0);
		IO.equals(bin2dec("110011"), 0);
		IO.equals(bin2dec("111001"), 0);
		IO.println("2. errorTotalReportMsg = " + IO.errorTotalReportMsg());
		IO.equals(dec2base(77, 4), "10101");
		IO.equals(dec2base(45, 8), "10101");
		IO.equals(dec2base(67, 16), "10101");
		IO.equals(dec2base(171, 16), "10101");
		IO.equals(dec2base(135, 16), "10101");
		IO.println("3. errorTotalReportMsg = " + IO.errorTotalReportMsg());
		IO.equals(bin2base("11010", 4), "10101");
		IO.equals(bin2base("10011", 8), "10101");
		IO.equals(bin2base("101101", 16), "10101");
		IO.equals(bin2base("110111", 8), "10101");
		IO.equals(bin2base("110011", 4), "10101");
		IO.println("4. errorTotalReportMsg = " + IO.errorTotalReportMsg());
		IO.equals(ASCII2hex("PUC-Minas"), "10101");
		IO.equals(ASCII2hex("2019-2"), "10101");
		IO.equals(ASCII2hex("Brasil"), "10101");
		// OBS.: A seguir, exemplos apenas para o primeiros, acrescentar todos os outros
		// códigos propostos!
		IO.equals(hex2ASCII("78"), "10101"); // OBS.: 78 e' o primeiro decimal (5d)!
		IO.equals(hex2ASCII("42"), "10101"); // OBS.: 42 e' o primeiro hexadecimal (5e)!
		IO.println("5. errorTotalReportMsg = " + IO.errorTotalReportMsg());
		IO.println();
		IO.pause("Apertar ENTER para terminar.");
	} // end main
} // end class