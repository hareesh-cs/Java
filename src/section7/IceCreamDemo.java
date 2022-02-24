package section7;

public class IceCreamDemo {
    public static void main(String args[]){
        IceCream choc = new IceCream("chocolate",20,3);
        choc.addTopping("nuts");
        choc.addTopping("cherries");
        choc.addTopping("sprinkles");
        printIce(choc);
    }

    public static void printIce(IceCream ice){
        System.out.println("Name is" + ice.getName());
        System.out.println("Cost is "+ ice.getCost());
        System.out.println("Toppings are : ");
        ice.printToppings();
    }
}
