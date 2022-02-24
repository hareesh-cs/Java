package assignment.assignment5.main;
import assignment.assignment5.data.Data;
import  assignment.assignment5.signleton.Singleton;
public class Main {
    public static void main(String[] args) {
        Data obj =new Data();
        //global variables which can get default values.
        obj.disp();
        //local variables which are not initialized but does not get any default values.
        obj.show();
        //static methods can only access static variables.
        Singleton obj1 = new Singleton("Hi");
        System.out.println(obj1.sMethod("Hello"));
        obj1.print();

    }
}
