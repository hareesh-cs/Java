package assignment.assignment7.innerclass;

public class BOuter {
    BOuter() {
        System.out.println("BOuter class constructor is running.");
    }

    static class BInner extends AOuter.AInner {

        BInner(String str) {
            super(str);
        }

        @Override
        void show() {
            System.out.println(super.str + " from BInner class");
        }
    }
}
