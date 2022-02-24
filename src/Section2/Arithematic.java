package Section2;

public class Arithematic {
    public static void main(String[] args) {
        int a =10;
        int b =6;
        int sum=a+b;
        System.out.println("Sum = "+sum);
        int difference= a-b;
        System.out.println("Diff = "+difference);
        int product = a*b;
        System.out.println("Product = "+product);
        int quotient= a/b;
        System.out.println("Quotient = "+quotient);
        int remainder = a%b;
        System.out.println("Remainder = "+remainder);
        int result=sum;
        //Binary operators
        result+=20;
        System.out.println("Result = "+result);
        //unary operators
        result++;
        System.out.println("Result = "+result);
        result--;
        System.out.println("Result = "+result);
    }
}
