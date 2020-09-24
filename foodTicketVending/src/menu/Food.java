package menu;

public class Food extends Menu{

	public Food(String name, int price) {
		// 引数は子クラス「coffee」等からもらう

		super(name, price);
		// もらった引数を使用して親クラスMenu のメソッドを呼び出す

	} // super(); で呼び出された場合、処理は子クラスの中で行うイメージ

}
