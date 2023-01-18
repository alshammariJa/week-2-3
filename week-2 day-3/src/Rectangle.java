public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.length=1.0;
        this.width=1.0;

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(double v){
        double area =length* width/2;
        return area;
    }
    public double etPerimeter(){
        double   perimeter  = 2*(length+width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +super.toString()+
                '}';
    }
}
