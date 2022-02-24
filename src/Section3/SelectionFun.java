package Section3;

import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Pub");
        System.out.println("please enter your age");
        int age=sc.nextInt();
        if(age>=21){
            System.out.println("You can have a beer");
        }
        else if (age>16){
            System.out.println("You can have a coke");
            System.out.println("You can Drive too");
        }
        else {
            System.out.println("You can have a coke");
        }
        System.out.println("Thanks for coming");
    }
}
