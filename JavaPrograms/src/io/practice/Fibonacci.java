package io.practice;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int number = 10;
		int sum = 0;

		for (int i = 0; i <= number; i++) {
			if(number<=10) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum + "   ");
			}
		}

	}

}
