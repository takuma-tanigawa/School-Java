package menu;

public class Menu {

	public String name;
	public int price;

	public Menu(String name, int price) {
		// 引数は子クラス「Food」 or 「Drinc」からもらう

		this.name = name;
		this.price = price;

	} // super(); で呼び出された場合、処理は子クラスの中で行うイメージ

}
