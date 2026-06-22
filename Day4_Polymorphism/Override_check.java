package Day4_Polymorphism;

public class Override_check {
    void dispplay(){
        System.out.println("parent");
    }
}
 class child extends Override_check{
    
    void display(){
        System.out.println("child");
    }
}
class test5{
    public static void main(String[] args) {
        child obj=new child();
        obj.display();
    }
}
