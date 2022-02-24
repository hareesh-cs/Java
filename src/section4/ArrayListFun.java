package section4;
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String args[]){
        ArrayList list = new ArrayList<>();
        list.add("Hareesh");
        list.add("zemoso");
        list.add(1);
        list.add("List");

        for(Object i : list){
            System.out.println(i);
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
