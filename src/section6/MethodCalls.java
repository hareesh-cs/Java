package section6;

public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }
    public  static void doSomething(){
        System.out.println("In doSomething method");
        int num=getSomething();
        System.out.println("number fetched by getSomething method is "+num);
    }
    public static int getSomething(){
        return 150;
    }
}
