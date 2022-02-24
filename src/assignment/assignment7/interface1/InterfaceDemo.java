package assignment.assignment7.interface1;

interface A{
    public void getA();
    public void setA();
}
interface B{
    public void getB();
    public void setB();
}
interface C{
    public void getC();
    public void setC();

}
interface D extends A, B, C {
    public void getD();

}
class E implements D{
    public void getA(){
        System.out.println("interface A get method");
    }
    public void setA(){
        System.out.println("interface A set method");
    }
    public void getB(){
        System.out.println("interface B get method");
    }
    public void setB(){
        System.out.println("interface B set method");
    }
    public void getC(){
        System.out.println("interface C get method");
    }
    public void setC(){
        System.out.println("interface C set method");
    }
    public void getD(){
        System.out.println("interface D get mehtod ");
    }
};

public class InterfaceDemo {

    static void method1(A i) {
        i.getA();
        i.setA();
    }
    static void method2(B i) {
        i.getB();
        i.setB();
    }
    static void method3(C i) {
        i.getC();
        i.setC();
    }
    static void method4(D i) {
        i.getD();
    }

    public static void main(String[] args) {
        E s = new E();
        method1(s);
        method2(s);
        method3(s);
        method4(s);

    }
}