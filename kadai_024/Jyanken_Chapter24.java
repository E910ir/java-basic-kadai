package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	private Scanner scanner = new Scanner(System.in);
    private HashMap<String, String> handMap;

    public Jyanken_Chapter24() {
        handMap = new HashMap<String, String>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }
	
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましよう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
			
		String input = "";
			
		while (true) {
			input = scanner.nextLine();	
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			} else { 
				System.out.println("エラーです。再度、じゃんけんの手を選んでください");
			}
		}
		return input;
			
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int index = (int)Math.floor(Math.random() * 3);
		return hands[index];
	}
	
	// じゃんけんを行う
	public void playGame() {
		String myHand  = getMyChoice();
		String cpuHand = getRandom();
		
		// じゃんけんの出力処理
		HashMap<String, String> handMap = new HashMap<String, String>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
        
        // じゃんけんの結果を出力
        System.out.println("自分の手は" + myHand + ", 対戦相手の手は" + cpuHand);
        
        if (myHand.equals(cpuHand)) {
            System.out.println("あいこです。");
        } else if ((myHand.equals("r") && cpuHand.equals("s")) ||
                   (myHand.equals("s") && cpuHand.equals("p")) ||
                   (myHand.equals("p") && cpuHand.equals("r"))) {
            System.out.println("自分の勝ちです。");
        } else {
            System.out.println("自分の負けです。");
        }
	}
	
}
