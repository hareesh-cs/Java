package assignment.assignment7.interface2;
interface Cycle{
    void code();
    void factories();

}
class Unicycle implements Cycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Unicycle Factory.");
    }

}

class Bicycle implements Cycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Bicycle Factory");
    }
}

class Tricycle implements Cycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Tricycle Factory.");
    }
}

class MainClass {
    public static void main(String[] args){
        Unicycle obj = new Unicycle();
        obj.code();
        Bicycle obj1 = new Bicycle();
        obj1.code();
        Tricycle obj2 = new Tricycle();
        obj2.code();
    }
}
