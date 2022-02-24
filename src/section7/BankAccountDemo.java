package section7;

public class BankAccountDemo {
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount("Hareesh");
        BankAccount yourAccount = new BankAccount("Raghuraj",500);

        myAccount.deposit(100);
        System.out.println("Owner is "+myAccount.getOwner()+" and the balance is "+myAccount.getBalance());
        myAccount.withdraw(50);
        System.out.println("Owner is "+myAccount.getOwner()+" and the balance is "+myAccount.getBalance());
        System.out.println("Owner is "+yourAccount.getOwner()+" and the balance is "+yourAccount.getBalance());
    }
}
