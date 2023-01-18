public class Main {
    public static void main(String[] args) {
        Shape sp =new Shape("green",true);
//        sp.setColor("red");
//        System.out.println(sp.getColor());
//
//       Circle c =new Circle(2.0);
//       System.out.println(c.getArea());
//
//        System.out.println( c.getPerimeter());
//        System.out.println( c.toString());

        Rectangle r= new Rectangle();
        System.out.println(r.getArea(1.5));
        System.out.println(r.etPerimeter());
        System.out.println(r.toString());


    }
}