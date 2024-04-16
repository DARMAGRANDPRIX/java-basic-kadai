package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	HashMap<String,String> jyanken = new HashMap<String,String>();
	public Jyanken_Chapter24 () {
		jyanken.put("r","グー");
		jyanken.put("s","チョキ");
		jyanken.put("p","パー");
		}
	public String getMyChoice () {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);
		String input;
		while (true) {
			input = scanner.next();
			if(!input.equals("r") && !input.equals("s") && !input.equals("p")) {
				System.out.println(input + "は正しい手ではありません。もう一度入力してください");
			}
			else {
				break;
			}
		}
		
		scanner.close();
		return input;
	}
	public String getRandom () {
		String [] jyankenArray = {"r","s","p"};
		return jyankenArray[(int)(Math.floor(Math.random() * 3))];
	}
	public void playGame (String mychoice , String opponent) {
		System.out.println("自分の手は" + jyanken.get(mychoice) + "、相手の手は" + jyanken.get(opponent));
		if (mychoice.equals(opponent)) {
			System.out.println("あいこです");
		} else if ((mychoice.equals("r") && opponent.equals("s")) || (mychoice.equals("s") && opponent.equals("p")) || (mychoice.equals("p") && opponent.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("相手の勝ちです");
		}
		
	}
}