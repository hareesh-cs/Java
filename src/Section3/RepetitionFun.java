package Section3;

import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
        int count=0;
        while(count<10){
            System.out.println(count);
            count++;
        }
        count=10;
        do{
            System.out.println(count);
            count++;
        }while (count<10);
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        Scanner sc=new Scanner(System.in);
        int input=1;
        while (input>0){
            System.out.println("Enter a number to continue or enter Negative number to exit");
            input= sc.nextInt();
            System.out.println(input);
        }
    }
}
