package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		
		taro.familyName = "加藤";
		taro.address = "東京都中野区○×";
		taro.execIntroduce();
		System.out.println();
		
		ichiro.familyName = "加藤";
		ichiro.address = "東京都中野区○×";
		ichiro.execIntroduce();
		System.out.println();
		
		hanako.familyName = "加藤";
		hanako.address = "東京都中野区○×";
		hanako.execIntroduce();
		System.out.println();

	}

}
