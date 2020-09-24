package sugoroku;

import java.util.ArrayList;

public class Map {

	ArrayList<String> map = new ArrayList<String>();
//	String[] map = new String[100];
	String[] mark = {"□","■","●"};

	Map(){
		for(int i = 0; i < 10; i++) {
			int num = this.dice();

			if(num >= 2) {
				if(num <= 4) {
					map.add(this.mark[0]);
				} else{
					map.add(this.mark[1]);
				}
			}else {
				map.add(this.mark[2]);
			}
		}

		map.set(0, "Ｓ");
//		map.add(96, "●");
//		map.add(97, "●");
//		map.add(98, "●");
//		map.add(99, "　Ｇ");
		map.set(9, "　Ｇ");
	}
	int dice() {
		int dice = new java.util.Random().nextInt(6) + 1;
		return dice;
	}
}
