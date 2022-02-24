package assignment.assignment7.innerclass;

public class AOuter {
    AOuter() {
        System.out.println("AOuter class constructor is running.");
    }

    static class AInner {
        String str;

        AInner(String str) {
            this.str = str;
        }

        void show() {
            System.out.println(str);
        }
    }
}
