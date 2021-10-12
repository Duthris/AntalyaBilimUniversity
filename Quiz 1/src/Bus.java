// Adem Anil YALIMDEMIR - 180201017

public class Bus extends Vehicle {

	Wheel[] wheel = new Wheel[4];
	
	public Bus(int chassisNumber) {
		super(chassisNumber);
		wheel[0] = new Wheel();
		wheel[1] = new Wheel();
		wheel[2] = new Wheel();
		wheel[3] = new Wheel();
	}

	public String toString() {
		return "Bus is a "+super.toString();
	}

}
