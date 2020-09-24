package sugoroku;

public class Event {

	static int event(String s,int diceCase) {
		switch(s) {
			case "●" :
				diceCase -= 3;
				System.out.println("●は戻りマスです。３マス戻ります");
				break;
			case "■" :
				diceCase += 5;
				System.out.println("■は進みマスです。５マス進みます");
				break;
			case "　Ｇ" :
				
			default :
				System.out.println("□は何もありません。次のターンへ進みます");
		}
		return diceCase;
	}

}
