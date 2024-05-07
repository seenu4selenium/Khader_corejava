package basics;

public class ControlStatementsDemo {

	public static void main(String[] args) {

		// print 1 to 10 numbers
		for (int i = 1; i <= 10 || i == 0; i++) {
			System.out.println(i);
		}
		System.out.println("**********************");
		// Print Alphabets(a-z)
		for (char abc = 'a'; abc <= 'z'; abc++) {// 97<=122
			System.out.println(abc);
		}

	}

}
