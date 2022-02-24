package section7;

import java.util.ArrayList;

public class IceCream {
    private final String name;
    private final int cost;
    private final int numScoops;
    private final ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops){
        this.name=name;
        this.cost=cost;
        this.numScoops=numScoops;
        this.toppings=new ArrayList<>();
    }

    public void addTopping(String topping){
        this.toppings.add(topping);
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public int getNumScoops(){
        return numScoops;
    }

    public void printToppings(){
        for(String str : toppings){
            System.out.println(str);
        }
    }
}
