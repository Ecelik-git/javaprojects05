package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance_1_FibonacciSeriesForAnyNumber {
	
	static boolean fibo;
	static int num1;
	static int num2;

	public static void main(String[] args) {
//		* Write a method which accepts an integer as parameter
//	     * and returns “true” if it is a Fibonacci number
//	     *
//	     * Then check the result and print
//	     * “Fibonacci series contain your number” 
//	     * or
//	     * “Fibonacci series contain that numbers : X and Y”
//	     * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
//	     * 
//	     * 0 1 1 2 3 5 8 13 21 34 ....
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Fibonacci: ");
		int input = scan.nextInt();
		
		checkFibonacci(input);
		
		if(fibo){
			System.out.println("Fibonacci series contain your number");
		}else {
			System.out.println("Fibonacci series contain that numbers between: "+num1+" and "+num2);
		}
		scan.close();
	}

	private static boolean checkFibonacci(int input) {
		
		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		for (int i = 2; i<input; i++) {
			fibonacci.add(fibonacci.get(i-2)+fibonacci.get(i-1));
			
			if(fibonacci.get(i)>=input) {
				break;
			}
		}
		
		if(fibonacci.contains(input)) {
			fibo=true;
		}else {
			fibo=false;
		}
		
		
		num1=fibonacci.get(fibonacci.size()-1);
		num2=fibonacci.get(fibonacci.size()-2);
		
		return fibo;
		
	}
	

}
