package section2;

import java.util.Scanner;

public class ProjectAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2,num3,average;
        System.out.println("Enter 3 numbers: ");
        num1= sc.nextDouble();
        num2= sc.nextDouble();
        num3= sc.nextDouble();
        average=(num1+num2+num3)/3.0;
        System.out.println("Average = "+average);
    }
}
