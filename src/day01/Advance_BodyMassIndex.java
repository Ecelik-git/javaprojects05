package day01;

import java.util.Scanner;

public class Advance_BodyMassIndex {

	public static void main(String[] args) {
//		% Format Specifier
//	     * %s , %S formats strings
//	     * %f formats the floating-point numbers
//	     * %d formats decimal integers
//	     *
//	     * %[flags][width][.precision]S
//	     * https://www.baeldung.com/java-printstream-printf
//	     */
//			//System.out.printf(format, args);
//	    /* Write a Java program that accepts name,surname, age, weight, height
//	     * than calculates BMI and prints the user’s status like that;
//	     * John CARPENTER is 25 years old, his height is 180 cm and his weight is 80 kg. 
		//He is HEALTHY because his BMI=24.7
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your info/name/surname/age/weight and height: ");
		String name = scan.next();
		String surname = scan.next();
		int age = scan.nextInt();
		double weight = scan.nextDouble();
		double height = scan.nextDouble();
		double bmi=weight/(height*height/10000);
		String status;
		if(bmi<=20) {
			status="weak";
		}else if(bmi<=25) {
			status="healty";
		}else if(bmi<=30) {
			status="unhealty";
		}else {
			status = "obese";
		}
		scan.close();
//		//System.out.println(name+" "+surname+" is "+age+" years old, his height is "+height
//				+" cm and his weight is "+weight+" kg. \nHe is "+status+" because his BMI="+bmi);
		System.out.printf("%s %S is %d years old, his height is %.1f cm and "
				+ "his weight %.2f kg. He is %S because his BMI=%.1f", name, surname, age, height, weight, status, bmi);

	}

}
