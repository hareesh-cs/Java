package section5;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName, firstName, lastName;
        System.out.println("Enter Full Name: ");
        fullName= sc.nextLine();
        int indexOfSpace= fullName.indexOf(" ");
        firstName=fullName.substring(0,indexOfSpace);
        lastName=fullName.substring(indexOfSpace+1);
        System.out.println(firstName.toUpperCase()+" "+lastName.toLowerCase());
    }
}
