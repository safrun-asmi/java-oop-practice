public class BankAccount{
    String acc_number;
    String acc_holder_name;
    double balance;
    BankAccount(String acc_number,String acc_holder_name,double balance){
        this.acc_number=acc_number;
        this.acc_holder_name=acc_holder_name;
        this.balance=balance;
    }
    void display(){
        System.out.print("account_number: "+acc_number+" account_holder_name: "+acc_holder_name+" balance: "+balance);
    }
    public static void main(String[] args){
        BankAccount ba=new BankAccount("123AFX456","safrun",1000);
        ba.display();
    }

}