package javafinalexam;

import exceptionExample.Example6;

public class Question11 {

	void checkAge (int age) {
		if(age <=20) {
			throw new  ArithmeticException	("Cannot trave ");
			} else {
				System.out.println("Can travel  ");
			}
	}
	
	
	public static void main(String[] args) {
		
		Question11 tion = new Question11();
		tion.checkAge(23);
		System.out.println("Closed ");
		
		}

	}