
public abstract class Car implements Vehicle{
	//필드
	protected String brand;
	protected String model;
	protected int year;
	protected DrivingStrategy drivingStrategy;
	//생성자
	public Car(String brand, String model, int year, DrivingStrategy strategy) {
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.drivingStrategy = strategy;
	}

	//메소드
	
	public void displayInfo() {
		System.out.println("Brand: " + brand + ": " + model + " : " + year);
	}
	
	public void honk() {
		System.out.println("Beep! Beep!");
	}
	
	public abstract void showCarType();
	
	public void start() {
		System.out.println(brand+" ("+model+") is strating.");
	}
	
	public void stop() {
		System.out.println(brand+" ("+model+") is accelerating");
	}
	
	public void accelerate() {
		System.out.println(brand + " " + model + " is accelerating.");
	}
}
