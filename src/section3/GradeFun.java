package section3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Grade: ");
        char grade=sc.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Out Standing");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Above Average");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
