package section6;

public class MethodOverloading {
    public static void main(String[] args) {
        int result=getResult(22);
        System.out.println(result);
        result=getResult(10,20);
        System.out.println(result);
        result=getResult(10,"23");
        System.out.println(result);
    }
    public static int getResult(int num1){
        return num1*2;
    }
    public static int getResult(int num1,int num2){
        return num1*num2;
    }

    public static int getResult(int num1,String str){
        return Integer.parseInt(str)*num1;
    }
}
