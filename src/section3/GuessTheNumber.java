package Section3;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int ans= r.nextInt(100)+1;
        int chance=0;
        boolean guessed=false;
        while(!guessed){
            System.out.println("Enter guess:");
            int guess=sc.nextInt();
            chance++;
            if(guess>=1 && guess<=100) {
                if (guess == ans) {
                    guessed = true;
                    System.out.println("Congratulations you guessed the number in " + chance + " chances");
                } else if (guess > ans) {
                    System.out.println("Guess is too high");
                } else {
                    System.out.println("Guess is very low");
                }
            }
            else{
                System.out.println("Invalid Range");
            }
        }
    }
}