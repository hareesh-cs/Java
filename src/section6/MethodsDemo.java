package section6;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(23);
        int b=giveMe10();
        System.out.println("b = "+b);
        int sum=addThese(10,20);
        System.out.println("sum = "+sum);
        System.out.println("Square of 33 is "+square(33));
    }
    public  static void printHello(){
        System.out.println("Hello");
    }
    public static void printNumber(int a){
        System.out.println("the number is "+a);
    }
    public static int giveMe10(){
        return 10;
    }
    public static int addThese(int num1,int num2){
        return num1+num2;
    }
    public static double square(double num){
        return num*num;
    }
}
