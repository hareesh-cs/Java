package section5;

public class StringMethods {
    public static void main(String[] args){
        String myName="Hareesh Chakravarthy Sikakollu";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int index= myName.indexOf('y');
        System.out.println(index);

        String lastName = myName.substring(index+2);

        System.out.println("UpperCase is : "+upper);

        System.out.println("LowerCase is : "+lower);


        System.out.println("LastName is : "+lastName);
        String[] name = myName.split(" ");
        System.out.println(name[0]+name[1]+name[2]);
        if(name[0].equals(name[1])){
            System.out.println("Names are same");
        }
        else{
            System.out.println("Names are not same");
        }

        if(name[0].compareTo(name[2])>0){
            System.out.println("name1>name3");
        }
        else{
            System.out.println("name1<=name3");
        }
    }
}
