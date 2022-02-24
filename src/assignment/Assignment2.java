package assignment;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input String");
        String userInput= sc.nextLine();
        long checker = userInput.toLowerCase().chars().filter(ch -> ch >= 'a' && ch <= 'z').distinct().count();
        System.out.println("Input String containg all the alphabets? "+ (checker==26));
    }
}
