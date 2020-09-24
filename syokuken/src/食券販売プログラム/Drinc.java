package 食券販売プログラム;

public class Drinc extends Menu {

	String hotOrCold;

	public Drinc(String name, int price, String hotOrCold) {
		// 引数は子クラスからもらう

		super(name, price);
		// もらった引数を使って親クラスMenu からメソッドを呼び出す
		//

		this.hotOrCold = hotOrCold;
		// もらった情報「冷たい	or 熱い」を定義する

	} // super(); で呼び出された場合、処理は子クラスの中で行う

}
