package Section4;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL= new ArrayList<>();
        myAL.add(new Integer(10));
        myAL.add(20); //Auto Boxing
        for (int i=0;i<myAL.size();i++){
            System.out.println(myAL.get(i));
        }
    }
}
