package section7;

public class HouseDemo {
    public static void main(String[] args) {
        House h1 = new House(3,10,"White");
        House h2 = new House(4,15,"Black");

        h1.setColor("white");
        h1.setNumStories(3);
        h1.setNumWindows(10);


        h2.setColor("black");
        h2.setNumStories(4);
        h2.setNumWindows(15);


        System.out.println("My house is "+ h1.getColor()+" and has "+h1.getNumStories()+" stories and "+h1.getNumWindows()
        +" windows");
        System.out.println();
        System.out.println("Your house is "+ h2.getColor()+" and has "+h2.getNumStories()+" stories and "+h2.getNumWindows()
                +" windows");
        System.out.println();
        print(h1);
        print(h2);
    }

    public static void print(House h){
        System.out.println("The house is "+ h.getColor()+" and has "+h.getNumStories()+" stories and "+h.getNumWindows()
                +" windows");
        System.out.println();
    }
}