
public class TestZahlensystemwandler
{

	public static void main(String[] args) {
	System.out.println("getDigit(\"a\") ergibt " + MeinZahlensystemwandler.getDigit('a'));
	System.out.println("getDigit(\"Z\") ergibt " + MeinZahlensystemwandler.getDigit('Z'));
	System.out.println("getDigit(\"9\") ergibt " + MeinZahlensystemwandler.getDigit('9'));
	
	System.out.println("getDigit(\"1\") ergibt " + MeinZahlensystemwandler.getDigit(1));
	System.out.println("getDigit(\"9\") ergibt " + MeinZahlensystemwandler.getDigit(9));
	System.out.println("getDigit(\"10\") ergibt " + MeinZahlensystemwandler.getDigit(10));
	
	System.out.println("numToDec(\"170712\", 8) ergibt " + MeinZahlensystemwandler.numToDec("170712", 8));
	System.out.println("numToDec(\"170712\", 7) ergibt " + MeinZahlensystemwandler.numToDec("170712", 7));
	System.out.println("numToDec(\"01110110\", 2) ergibt " + MeinZahlensystemwandler.numToDec("01110110", 2));
	
	System.out.println("decToNum(\"118\", 2) ergibt " + MeinZahlensystemwandler.decToNum(118, 2));
	System.out.println("decToNum(\"61898\", 8) ergibt " + MeinZahlensystemwandler.decToNum(61898, 8));
	System.out.println("decToNum(\"69420\", 4) ergibt " + MeinZahlensystemwandler.decToNum(69420, 4));
	
	System.out.println("hexToDec(\"15\") ergibt " + MeinZahlensystemwandler.hexToDec("15"));
	System.out.println("hexToDec(\"20A\") ergibt " + MeinZahlensystemwandler.hexToDec("20A"));
	System.out.println("hexToDec(\"FF\") ergibt " + MeinZahlensystemwandler.hexToDec("FF"));
	
	System.out.println("decToHex(\"152\") ergibt " +  MeinZahlensystemwandler.decToHex(152));
	System.out.println("decToHex(\"1000\") ergibt " +  MeinZahlensystemwandler.decToHex(1000));
	System.out.println("decToHex(\"10\") ergibt " +  MeinZahlensystemwandler.decToHex(10));
	
	System.out.println("dualToDec(\"01110110\") ergibt " +  MeinZahlensystemwandler.dualToDec("01110110"));
	System.out.println("dualToDec(\"1101\") ergibt " +  MeinZahlensystemwandler.dualToDec("1101"));
	System.out.println("dualToDec(\"100110110001\") ergibt " +  MeinZahlensystemwandler.dualToDec("100110110001"));

	System.out.println("decToDual(\"321\") ergibt " +  MeinZahlensystemwandler.decToDual(321));
	System.out.println("decToDual(\"1000\") ergibt " +  MeinZahlensystemwandler.decToDual(1000));
	System.out.println("decToDual(\"10\") ergibt " +  MeinZahlensystemwandler.decToDual(10));
	
	System.out.println("numToNum(\"10A\", 16, 2) ergibt " +  MeinZahlensystemwandler.numToNum("10A", 16, 2));
	System.out.println("numToNum(\"100110101010101\", 2, 10) ergibt " +  MeinZahlensystemwandler.numToNum("100110101010101", 2, 10));
	System.out.println("numToNum(\"5\", 8, 2) ergibt " +  MeinZahlensystemwandler.numToNum("5", 8, 2));

	}

}
