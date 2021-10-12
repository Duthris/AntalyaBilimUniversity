
public class TestInterface {

	public static void main(String[] args) {

		Bicycle bicycle = new Bicycle();
		
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);
		
		System.out.println("Bicycle's present state ");
		bicycle.printState();
		
		Car car = new Car();
		
		car.changeGear(1);
		car.speedUp(4);
		car.applyBrakes(3);
		
		System.out.println("");
		
		System.out.println("Car's present state ");
		car.printState();
		
	}

}
