package Day2_Encapsulation;

public class BankAccount {
    private int balance;
    public void withDraw(int amount){
        if(amount>balance){
            System.out.println("no sufficient balance");
        }
        balance-=amount;
    }
    public void deposit(int amount){
        if(amount<0){
            System.out.println("amount cant be negative");
        }
        balance+=amount;
    }
    public String toString(){
        return "available_balance: "+balance;
    }
}
class test{
    public static void main(String[] args){
    BankAccount b=new BankAccount();
     b.withDraw(900);
     b.deposit(1000);
    System.out.println(b);
    }
}
