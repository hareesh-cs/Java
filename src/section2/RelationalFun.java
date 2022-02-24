package section2;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool=true;
        boolean yourBool=false;
        int myAge=23;
        int yourAge=27;
        System.out.println("myBool = "+myBool);
        System.out.println("yourBool = "+yourBool);
        boolean ageComparision=myAge > yourAge;
        System.out.println("myAge > yourAge?: "+ageComparision);
        ageComparision=yourAge > myAge;
        System.out.println("yourAge > myAge?: "+ ageComparision);
        ageComparision= yourAge==myAge;
        System.out.println("yourAge == myAge?: "+ ageComparision);
    }
}

