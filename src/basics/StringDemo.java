package basics;

public class StringDemo {

	public static void main(String[] args) {
		String a = "Hi Khader";
		System.out.println(a);

		String b = "How are YOU?";
		System.out.println(b);

		// Concatenation
		System.out.println(a + " " + b);

		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());

		// length
		System.out.println(a.length());
		// index
		System.out.println(a.charAt(3));

		String c = "Apple";
		String d = "Apple";
		// Verify c,d strings are matching or not?
		if (c.equals(d)) {
			System.out.println("both the Strings are matching");
		} else {
			System.out.println("both the Strings are not matching");
		}
		
		String e = "Hi Khader, how are you, how is your work?";
		//Validate work word is available or not?
		if (e.contains("work")) {
			System.out.println("the String does contains 'work' word");
		} else {
			System.out.println("the String doesn't contains 'work' word");
		}
		

	}

}
