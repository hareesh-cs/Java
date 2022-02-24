package section2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name= sc.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("What is your age?");
        int age=sc.nextInt();
        System.out.println(name+" is "+age+" years old");
    }
}
