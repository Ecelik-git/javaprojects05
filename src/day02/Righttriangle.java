package day02;

import java.util.Scanner;

public class Righttriangle {
//	 Create Right Triangle pattern
//	 * 
//	 * Example: Enter a number 
//5
// * 
// * * 
// * * * 
// * * * * 
// * * * * *
	public static void main(String[] args) {
		
		rightTriangle();
		
		
	}
	public static void rightTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}
