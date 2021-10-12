// Adem Anil YALIMDEMIR - 180201017 / Lab 3

public class Square extends TwoDimentionalShape{
    private double length;

    public Square(double length) {
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
       @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return String.format("%sLength: %.2f\n",super.toString(),getLength());
    }

}