package advancedFeattures;

public class MainShape {

    public static void main(String[] args) {

        Shape r1 = new Rectangle(40, 20);
        ((Rectangle) r1).test();
        System.out.println("Aria dreptunghiului r1 este: " + r1.calculateArea());
        System.out.println("Perimetrul dreptunghiului r1 este: " + r1.calculatePerimeter());
        System.out.println();

        Rectangle r2 = new Rectangle(20,10);
        System.out.println(r2.toString());
        System.out.println("Aria dreptunghiului r1 este: " + r2.calculateArea());
        System.out.println("Perimetrul dreptunghiului r1 este: " + r2.calculatePerimeter());

        System.out.println();
        r2.setSide1(10);
        r2.setSide2(5);
        System.out.println("Aria dreptunghiului r2 este:" + r2.calculateArea());
        System.out.println("Perimetrul dreptunghiului r2 este:" + r2.calculatePerimeter());


           }
}