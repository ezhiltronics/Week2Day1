package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a Software tester";

		String[] str = test.split(" ");

		for (int i = 0; i < str.length; i++) {

			if (i % 2 == 1) { 

				StringBuilder sb = new StringBuilder(str[i]);
				str[i] = sb.reverse().toString();
				System.out.println(str[i]);
			} else {
				System.out.println(str[i]);
			}

		}

	}
}
		
