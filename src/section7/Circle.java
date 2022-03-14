package section7;

public class Circle {
    private double radius;

    public  Circle(){
        this(1);
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}
