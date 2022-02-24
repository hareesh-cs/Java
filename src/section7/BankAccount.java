package section7;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this(owner,0);
    }

    public BankAccount(String owner, int balance){
        this.owner=owner;
        this.balance=balance;
    }

    public void deposit(int val){
        if(val>=0){
            balance+=val;
        }
        else{
            System.out.println("Amount should be greater than zero");
        }
    }

    public void withdraw(int amt){
        if(amt>0 && amt<=balance){
            balance-=amt;
        }
        else{
            System.out.println("the amount should be greater than 0 and must be less than your balance");
        }
    }

    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}
