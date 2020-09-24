package code1402;

public class Main {

	public static void main(String[] args) {
//		Empty e = new Empty();
//		String s = e.toString();
//		System.out.println(s);

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;

		if((h1).equals(h2) == true) {
			System.out.println("等しい");
		} else {
			System.out.println("等しくない");
		}

//		System.out.println(h.toString());
//		printAnything(h);



	}

	public static void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
