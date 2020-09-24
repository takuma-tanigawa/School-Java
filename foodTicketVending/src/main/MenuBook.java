package main;

import menu.Beer;
import menu.Coffee;
import menu.FriedRice;
import menu.Gyoza;
import menu.Menu;
import menu.Ramen;
import menu.Xiaolongbao;

public class MenuBook {

	public Menu showMenu() {

		//表示メニューを作成

		Menu[] menus = new Menu[6];
		menus[0] = new Coffee("コーヒー", 300, "Cold");
		menus[1] = new Beer("ビール", 500, "冷");
		menus[2] = new FriedRice("コーヒー", 300);
		menus[3] = new Ramen("拉麺", 950);
		menus[4] = new Gyoza("餃子", 950);
		menus[5] = new Xiaolongbao("小籠包", 950);

		System.out.println("商品を選んでください");

		// 出来たメニューを表示
		for(int i = 0; i < menus.length; i++) {
			System.out.println((i + 1) + ":" + menus[i].name + ":" + menus[i].price + "円");
		}

		// 注文受付
		System.out.println("番号で指定してください");
		int order = new java.util.Scanner(System.in).nextInt();

		return menus[order -1];


	}
}
