package section7;

public class CircleDemo {
    public static void main(String args[]){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area is : " + String.format("%.2f",c1.area())+" and the circumference "+c1.circumference());

        System.out.println("Area is : " + String.format("%.2f",c2.area())+" and the circumference "+c2.circumference());
    }
}
