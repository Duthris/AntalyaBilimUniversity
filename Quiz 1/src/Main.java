// Adem Anil YALIMDEMIR - 180201017

public class Main {

	public static void main(String[] args) {
		Car car = new Car(1600);
		Bus bus = new Bus(1600);
		
		System.out.println(car.toString());
		System.out.println(bus.toString());

		System.out.println("Car's chassis number is: "+car.chassisNumber);
		System.out.println("Bus's chassis number is: "+bus.chassisNumber);
		
		for (int i = 0; i < car.wheel.length; i++) {
			System.out.println("Car's "+(i+1)+" wheel size is: "+car.wheel[i].size);
		}
		

		for (int i = 0; i < bus.wheel.length; i++) {
			System.out.println("Bus's "+(i+1)+" wheel size is: "+bus.wheel[i].size);
		}
	}

}
