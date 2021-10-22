package io.practice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args){
		int number;
		int rem;
		int sum=0;
		int rev=0;

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		number=scan.nextInt();
		int temp=number;
		
		while(number!=0){
		  rem=number%10; 
		  sum=sum*10+rem; 
		  rev=sum; 
		  number=number/10; 
		}

		if(rev==temp){
		System.out.println("number is palindrome");
		}
		
		else
		{
			System.out.println("not palindrome");
		}

		}

}
