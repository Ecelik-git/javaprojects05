package day02;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
//		Write a return method that accepts a sentence as parameter
//			     * Then converts it to Camelcase
//			     * (without any space or specialCharacter)
//			     *
//			     * Input : I am writing code easily
//			     * Output : IAmWritingCodeEasilyItIsGreat
		camelCase();

	}
	public static void camelCase() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = scan.nextLine();
		String arr[]=str.split(" ");
		for(String w: arr) {
			String str1 = w.toUpperCase().substring(0, 1)+w.substring(1);
			System.out.print(str1+" ");
		}
		scan.close();
	}

}
