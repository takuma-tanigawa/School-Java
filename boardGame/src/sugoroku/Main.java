package sugoroku;

public class Main {

	public static void main(String[] args) {
		int diceCase = 0;
		boolean flg = true;

		System.out.println("すごろくゲーム");
		System.out.println("マップを生成しています");
		System.out.println("□マスは何もなし、■マスは５マス進んでください、●マスは３マス戻ってください");
		System.out.println("現在マスは〇です");
		System.out.println("");
		Map M1 = new Map();

		for(int i = 0; i <10; i++) {
			System.out.print(M1.map.get(i));
			if((i % 5) == 0) {
				System.out.print("　");
			}
		}
		System.out.println("");

		while(flg) {
			if(M1.map.isEmpty()) {
				System.out.println("ゴールしました、おめでとうございます");
				flg = false;
				break;
			}

			System.out.println("あなたのターンです　エンターキーでダイスを振ってください");
			System.out.println("Enter");

			String s = new java.util.Scanner(System.in).nextLine();
			int dice = M1.dice();

			System.out.println("ダイスの結果は" + dice + "です　ダイスの結果分進みます");

//			try{
//				for(int i = 0; i < dice; i++){
//					M1.map.remove(0);
//				}
//			} catch (Exception e) {
//				continue;
//			}

			diceCase = diceCase + dice;
			if(diceCase > 10) {
				int back = (diceCase - 10);
				diceCase = 10;
				diceCase -= back;
				if(diceCase != 10) {
					System.out.println("ゴール地点を超えました、" + back +"マス分マスを戻ります");
				}
			}
			try {
				System.out.println("今いるマスは" + M1.map.get(diceCase) + "です");

				diceCase = Event.event(M1.map.get(diceCase),diceCase);


				System.out.println("〇");
				for(int i = diceCase; i <10; i++) {
						System.out.print(M1.map.get(i));
				}
				System.out.println("");

			} catch (Exception e) {
				continue;
			}
		}
	}
}
