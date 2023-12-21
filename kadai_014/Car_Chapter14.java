package kadai_014;

public class Car_Chapter14 {
	// フィールド(内部データ)
	private int gear;
	private int speed;
	
	public Car_Chapter14() {
		this.gear  = 1;  // 初期ギアは1
		this.speed = 10; // 初期速度は時速10km
	}
	
	// ギアの値により速度を変える
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		switch (afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;	
		}
		System.out.println("ギア1から" + afterGear + "に切り替えました");
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
