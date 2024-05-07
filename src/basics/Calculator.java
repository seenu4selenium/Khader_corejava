package basics;

import java.util.Scanner;

public class Calculator {

	public static void add() {
		int a;
		int b;
		// Create an Object for parent class
		// CLASSNAME objectName = new CLASSNAME();
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();

		int c = a + b;
		System.out.println(c);
		System.out.println("Add method");
	}

	public static void sub() {
		int a = 54;
		int b = 7;
		int c = a - b;
		System.out.println(c);
		System.out.println("sub method");
	}

	public static void mul() {
		int a = 5;
		int b = 4;
		int c = a * b;
		System.out.println(c);
		System.out.println("mul method");
	}

	public static void main(String[] args) {
		System.out.println("I am main method");
		// Method calling
		add();

	}

}
