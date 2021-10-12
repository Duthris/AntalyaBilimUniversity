// Adem Anil YALIMDEMIR - 180201017 / Lab 3

public class Triangle extends TwoDimentionalShape{
    private double  base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    

    @Override
    public double getArea() {
        return  (getBase()*getHeight())/2;
    }

    @Override
    public String toString() {
        return String.format("%sBase: %.2f\nHeight: %.2f\n", super.toString(),getBase(),getHeight()); 
    }
    
}