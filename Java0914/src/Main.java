
public class Main {

	public static void main(String[] args) {

//		String s1 = "スッキリJava";
//		String s2 = "Java";
//		String s3 = "java";
//		String s4 = "";
//		String s5 = null;
//
//		if(s2.equals(s3)) {
//			System.out.println("s2とs3は等しい");
//		}
//
//		if(s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2とs3はケースを区別しなければ等しい");
//		}
//
//		System.out.println("s1の長さは" + s1.length() + "です");
//
//		if(s4.isEmpty()) {
//			System.out.println("");
//		}
//
//		if(s1.isEmpty()) {
//			System.out.println("s1は空文字です");
//		}

//		String s1 = "Java programming";
//		System.out.println("文字列s1の４文字目以降は" + s1.substring(3));
//		System.out.println("文字列s1の４～８文字目以降は"+ s1.substring(3, 8));
//		System.out.println("文字列s1を小文字は、++" + s1.toLowerCase() + "++");
//		System.out.println("文字列s1を大文字は、++" + s1.toUpperCase() + "++");
//		System.out.println("文字列s1のprogrammingをstudyに変更する ++" + s1.replace("programming", "study") + "++");

//		StringBuilder sb = new StringBuilder();
//
//		boolean sFlag = false;
//		boolean eFlag = false;
//
//		String sDate = "2018-02-05";
//		String eDate = "2018-03-01";
//
//		sb.append("select * from 家計簿 ");
//
//		if(sFlag) {
//			sb.append("where 日付 >= '" + sDate + "'");
//		}
//
//		if(eFlag) {
//			sb.append("and 日付 <= '" + eDate + "'");
//		} else {
//			sb.append("where 日付 <= '" + eDate + "'");
//		}
//
//		System.out.println(sb.toString());

//		boolean sd = isValidPlayerName2("TANIGAWA");
//
//		System.out.println(sd);

//		Kuku.kuku();

//		long start = System.currentTimeMillis();
//		// ここで何らかの時間がかかる処理
//		long end = System.currentTimeMillis();
//		System.out.println("処理にかかった時間は……" + (end - start) + "ミリ秒でした");

		StringBuilder sb = new StringBuilder();

		for(int i = 1; i<= 100; i++) {
			sb.append(i + ",");

		}
		String s = sb.toString();
		System.out.println(s);

	}

	public static boolean isValidPlayerName1(String name) {

		if(name.length() != 8) {
			return false;
		}

		char first = name.charAt(0);

		if(!(first >= 'A' && first <= 'Z')) {
			return false;
		}

		for(int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}

		return true;
	}

	public static boolean isValidPlayerName2(String name) {

		return name.matches("[A-Z][A-Z0-9]{7}");

	}

}
