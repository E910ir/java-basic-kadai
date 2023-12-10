package kadai_024;

import java.util.Scanner;

public class JyankenExec_Chapter24 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		// じゃんけんの結果を出力する
		jyanken.playGame();
		
		scanner.close();
	}

}
