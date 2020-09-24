package 食券販売プログラム;

public class main {

	public static void main(String[] args) {

		//メニュー配列

		Menu orders[] = new Menu[5];
		boolean isFinish = false;

		MenuBook mb = new MenuBook();

		//注文受付
		for(int i = 0; i < orders.length; i++) {

			orders[i] = mb.showMenu();

			System.out.println("注文を続けますか? 続けるなら1 終了なら0");
			int flg = new java.util.Scanner(System.in).nextInt();
			if(flg != 1) {
				isFinish = true;
				break;
			}
		}

		//注文表示
		int total = 0;
		for(Menu m : orders) {
			if(m != null) {
				System.out.println(m.name + ":" + m.price);
				total += m.price;
			}
		}
		System.out.println("合計金額は" + total + "円");

	}

}
