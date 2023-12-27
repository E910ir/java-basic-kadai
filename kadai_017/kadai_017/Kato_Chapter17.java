package kadai_017;

public abstract class Kato_Chapter17 {
	
	public String familyName; // 姓を表す
	
	public String givenName;  // 名を表す
	
	public String address;    // 住所を表す
	
	// 共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	// 個別の紹介を出力する
	abstract void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
