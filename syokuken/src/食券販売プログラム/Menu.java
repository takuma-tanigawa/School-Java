package 食券販売プログラム;

public class Menu {

	String name;
	int price;

	public Menu(String name, int price) {
		// 引数は子クラス「Food」 or 「Drinc」からもらう

		this.name = name;
		this.price = price;

	} // super(); で呼び出された場合、処理は子クラスの中で行う

}
