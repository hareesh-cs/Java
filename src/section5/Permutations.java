package section5;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();

        for(int i=1 ; i<=5 ; i++){
            System.out.println("Enter the "+i+" Name");
            String input = s.nextLine();
            int index = input.indexOf(' ');
            firstName.add(input.substring(0,index));
            lastName.add(input.substring(index+1));
        }

        for(int i=0;i<5;i++){
            for(int j =0 ;j<5;j++){
                System.out.println(firstName.get(i)+" "+lastName.get(j));
            }
        }
    }
}