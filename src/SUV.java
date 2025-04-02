
public class SUV extends Car {//Car클래스를 상속받음 
	public SUV(String brand, String model, int year, DrivingStrategy strategy) {
		super(brand, model, year, strategy);
	}
	public void showCarType() {
		System.out.println("This is an SUV.");
	}
}
