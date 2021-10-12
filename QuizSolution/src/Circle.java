
public class Circle {
	private double x;
	private double y;
	private double radius;
	private static final double PI=3.14159;
	private static int count=0;
	
	Circle(double x, double y, double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
		count++;
	}
	
	Circle(){
		this(0,0,1);
		
	}
	
	public double getArea() {
		return 2*radius*PI;
		
	}
	
	public static int getCount() {
		return count;
		
	}
	
	public String toString() {
		return "Cricle [(" + x + "," + y + "), " + radius + "]";
	}

}
