import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> seki = new HashMap<String, String>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> number = new ArrayList<String>();

		String[] name1 = {"川﨑","國森","城野","谷川","坂口","浜田","滝本","　神","江本","川嵜","福原","杉山"
								,"折出","浦上","細田","横田","岡崎","野瀬","板垣","藤野"};

		for(int i = 0; i < 20; i++) {
			String s = String.valueOf(i);
			number.add(s);
			name.add(name1[i]);
			int e = new java.util.Random().nextInt(number.size());
			seki.put(name.get(i), number.get(e));
			number.remove(e);
		}

		for(String value : seki.keySet()) {
			String g = seki.get(value);
			System.out.println(g + "　の席の番号は　" + value);
		}

	}

}
