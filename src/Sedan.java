
public class Sedan extends Car{ 
	
	public Sedan(String brand, String model, int year,DrivingStrategy strategy) {
		super(brand,model,year,strategy);
	}
	public void showCarType() {
		System.out.println("this is a Sedan");
	}
}
