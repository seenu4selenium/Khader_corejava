package basics;

import java.util.Scanner;

public class FindOddOrEvenDemo {

	public static void main(String[] args) {
		int n;
		//Give custom input
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		if (n % 2 == 0) {
			System.out.println("The given number is EVEN "+n);
		} else {
			System.out.println("The given number is ODD "+n);
		}
	}

}
