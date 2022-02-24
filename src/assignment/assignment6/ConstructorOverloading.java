package assignment.assignment6;

public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("constructor without any parameters");
    }
    ConstructorOverloading(int num){
        this();
        System.out.println("Constructor with parameters, the parameter = "+num);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(30);
    }
}
