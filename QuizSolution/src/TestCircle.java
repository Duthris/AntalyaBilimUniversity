
public class TestCircle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3,5,10);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("The Number of Objects is " + Circle.getCount());

	}

}
