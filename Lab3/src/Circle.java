// Adem Anil YALIMDEMIR - 180201017 / Lab 3

public class Circle extends TwoDimentionalShape{
    private double radius;

    public Circle(double radius) {
       this.radius=radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    

    @Override
    public double getArea() {
       return Math.PI*Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return String.format("%sRadius: %.2f\n", super.toString(),getRadius());
    }
    
    
}