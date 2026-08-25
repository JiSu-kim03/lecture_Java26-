package overriding;

public class Cylinder extends Circle{
	private double height;

    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    @Override
    public double getArea() {
        double r = getRadius();
        return (2 * PI * r * r) + (2 * PI * r * height);
    }
}


