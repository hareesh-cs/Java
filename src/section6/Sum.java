package section6;

import java.util.ArrayList;

public class Sum {
    public static void main(String args[]){
        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(70);
        values.add(90);
        values.add(90);
        values.add(90);

        PrintSum(values);
    }

    private static void PrintSum(ArrayList<Integer> values) {
        int sum=0;
        for(int i : values){
            sum+=i;
        }

        System.out.println("The sum is : "+sum);
    }
}