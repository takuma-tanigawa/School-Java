package 食券販売プログラム;

public class Coffee extends Drinc {

	public Coffee(String name, int price,String hotOrCold) {
		// mainメソッドから呼び出された時に引数をもらう

		super(name, price, hotOrCold);
		// もらった引数を使用して親クラスDrinc からメソッドを呼び出す

	} // super(); で呼び出したメソッドの this.name 等はこのクラスに定義する
}
