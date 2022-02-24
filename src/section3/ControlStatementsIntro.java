package section3;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age=19;
        System.out.println(age);
        if(age>=18){
            System.out.println("You can Drive");
        }
        else {
            System.out.println("You can not Drive");
        }
        for(int i=1;i<=age;i++){
            System.out.println("Age = "+i);
        }
    }
}
