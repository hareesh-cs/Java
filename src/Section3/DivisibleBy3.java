package Section3;
import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        if(num%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by 3");
        }
    }
}
