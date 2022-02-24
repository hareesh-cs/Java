package assignment;

class InvalidCardNumber extends Exception{
    InvalidCardNumber(String str){
        super(str);
    }
}
class InvalidExpDate extends Exception{
    InvalidExpDate(String str){
        super(str);
    }
}
class InvalidCVV extends Exception{
    InvalidCVV(String str){
        super(str);
    }
}
class Verify extends Exception{
    Verify(String cardNumber, String expDate, String CVV) throws InvalidCardNumber, InvalidExpDate, InvalidCVV {
        if(cardNumber.length()!=16){
            throw new InvalidCardNumber("Invalid Card Number");
        }
        if(expDate.length()!=5){
            throw new InvalidExpDate("Invalid Exp Date");
        }
        if(CVV.length()!=3){
            throw new InvalidCVV("Invalid CVV");
        }
    }
}
public class Assignment8 {
    public static void main(String[] args) {
        try {
            Verify v= new Verify("1234123412341234","04/22","123");
        }
        catch (InvalidCardNumber|InvalidExpDate|InvalidCVV ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally Executed");
        }
    }
}
