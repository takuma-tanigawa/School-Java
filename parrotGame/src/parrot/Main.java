package parrot;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println("（・⊝・）　ナニカヨウカ？");

		boolean flag = true;
		ArrayList<String> b = new ArrayList<String>();
		String a;

		while(flag) {
			a = new java.util.Scanner(System.in).nextLine();

			if(a.equals("さようなら")) {
				System.out.println("（・⊝・）　ホナサイナラ～");
				flag = false;
				break;
			}

			if(b.contains(a)) {
				System.out.println("サッキキイタワ、ソレ　（・⊝・）");
			} else {
				b.add(a);
				System.out.println("（・⊝・）　" + a);
				System.out.println("（・⊝・）　ホンデ？");
			}
		}
	}
}
