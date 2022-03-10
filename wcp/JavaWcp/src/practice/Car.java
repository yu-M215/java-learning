package practice;

public class Car {
	// 燃費（Km/L）
	private double fuelCost;
	// 残量（L）
	private double fuelAmount;
	
	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	// moveメソッド
	public void move(int distance) {
		System.out.println(distance + "km 走ります");
		this.fuelAmount -= (distance / fuelCost);
	}
	
	// getFuelAmountメソッド
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
