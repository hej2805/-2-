
public class AutonomousCar extends Car implements SelfDriving {//Car클래스를 상속받음 
	public AutonomousCar(String brand, String model, int year, DrivingStrategy strategy) {
		super(brand,model,year, strategy);
	}
	public void showCarType() {
		System.out.println("This is an Autonomous Car.");
	}
	public void activateAutopilot() {//자율주행차 기능
		System.out.println(brand+" "+model+" is activating autopilot. ");
	}
	public void parkAutomatically() {//자율주행차 기능
		System.out.println(brand+" "+model+" is parking automatically.");
	}

}
