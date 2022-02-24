package section3;
import java.util.Random;

public class RandomDice {
    public static void main(String args[]){
        Random r = new Random();
        for(int i =0;i<10;i++){
            int diceValue= r.nextInt(6)+1;
            System.out.println(diceValue);
        }
    }
}
