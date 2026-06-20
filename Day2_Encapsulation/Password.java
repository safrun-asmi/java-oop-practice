package Day2_Encapsulation;

public class Password {
    private String password;
    public void setPassword(String password){
        if(password.length()<8){
            System.out.println("password should contain 8 or more characters");
        }else{
            this.password=password;
        }
    }
    void display(){
        System.out.println(password);
    }
}
class test5{
    public static void main(String[] args){
        Password p=new Password();
        p.setPassword("1234567890");
        p.display();
    }
}
