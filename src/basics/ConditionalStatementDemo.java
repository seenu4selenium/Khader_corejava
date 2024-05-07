package basics;

public class ConditionalStatementDemo {

	public static void main(String[] args) {
		int a = 90;
		int b = 80;
		// verify which is large value?
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);
		System.out.println("********************");

		if (a > b) {
			System.out.println("a is large value");
			
		} else if (b > a) {
			System.out.println("b is large value");
		} else {
			System.out.println("a & b both are equal");
		}
		
		

	}

}
