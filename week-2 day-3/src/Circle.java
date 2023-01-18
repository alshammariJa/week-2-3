public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){

        double area = 22 * radius * radius;
        return area;
    }
    public double getPerimeter(){
      double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "is subclass of "+super.toString()+'}';
    }
}
