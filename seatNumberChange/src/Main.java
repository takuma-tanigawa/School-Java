import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> seki = new HashMap<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> number = new ArrayList<>();

		// 出席番号順の名簿
		String[] name1 = {"川﨑","國森","城野","谷川","坂口","浜田","滝本","　神","江本","川嵜","福原","杉山"
								,"折出","浦上","細田","横田","岡崎","野瀬","板垣","藤野"};

		// sekiに名前を挿入する。numberに席番号を貯める。番号は20番まで
		for(int i = 0; i < 20; i++) {
			String s = String.valueOf(i + 1);
			number.add(s);
			name.add(name1[i]);
			seki.put(name.get(i), number.get(i));
		}

		// sekiに入った人の席番号をnumberから抜き出してシャッフルする
		for(int i = 0; i < 20; i++) {
			int e = new java.util.Random().nextInt(number.size());
			seki.replace(name1[i], number.get(e));
			number.remove(e);
		}

		// 出席番号順に名前と席番号を出力する
		for(int i = 0;i < 20; i++) {
			System.out.println(name1[i] + "　の席の番号は　" + seki.get(name1[i]));
		}

	}

}
