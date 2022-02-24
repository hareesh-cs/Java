package assignment;

import java.util.Scanner;

public class Assignment9 {
    public static boolean checkValidSentence(String sentence){
        String pattern="[A-Z].*[.]";
        return sentence.matches(pattern);
    }

    public static void test(String str){
        if(checkValidSentence(str)){
            System.out.println("The string is a valid sentence.");
        }
        else{
            System.out.println("The string is not a valid sentence.");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number sentences to check:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            System.out.print("enter the sentence");
            String str = sc.nextLine();
            test(str);
        }
    }
}
