package oumu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println("(⊙◞౪◟⊙)　ナニカヨウカ？");

		boolean flag = true;
		ArrayList<String> b = new ArrayList<String>();
		String a;

		while(flag) {
			a = new java.util.Scanner(System.in).nextLine();

			if(a.equals("さようなら")) {
				System.out.println("(⊙◞౪◟⊙)　ホナサイナラ～");
				flag = false;
				break;
			}

			if(b.contains(a)) {
				System.out.println("サッキキイタワ、ソレ　（´◉◞⊖◟◉｀）");
			} else {
				b.add(a);
				System.out.println("(⊙◞౪◟⊙)　" + a);
				System.out.println("(⊙◞౪◟⊙)　ホンデ？");
			}

		}




	}

}
