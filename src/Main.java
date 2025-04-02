
public class Main {
	public static void main(String[] args) {
		
		DrivingStrategy ecoMode=new EcoDriving();
		DrivingStrategy sportMode = new SportDriving();
		
		Car mySedan =new Sedan("Hyundai", "G90",2024,ecoMode);
		Car mySUV=new SUV("Hyundai", "Gv70",2024,sportMode);
		AutonomousCar myAutoCar = new AutonomousCar("Tesla","Model X",2024,ecoMode);
		
		mySedan.displayInfo();
        mySedan.start();
        mySedan.accelerate();
        mySedan.showCarType();
        mySedan.honk();
        mySedan.stop();
        System.out.println();

        mySUV.displayInfo();
        mySUV.start();
        mySUV.accelerate();
        mySUV.showCarType();
        mySUV.honk();
        mySUV.stop();
        System.out.println();

        myAutoCar.displayInfo();
        myAutoCar.start();
        myAutoCar.accelerate();
        myAutoCar.showCarType();
        myAutoCar.activateAutopilot();
        myAutoCar.parkAutomatically();
        myAutoCar.stop();
	}
}
