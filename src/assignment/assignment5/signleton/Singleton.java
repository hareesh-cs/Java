package assignment.assignment5.signleton;

public class Singleton {
    String str;
    public Singleton(String str){
        this.str=str;
    }

    public Singleton sMethod(String s) {
        //static methods can only access static variables;
        str=s;
        Singleton sc = new Singleton(s);
        return sc;
    }
    public void print() {
        System.out.println(str);
    }
}
