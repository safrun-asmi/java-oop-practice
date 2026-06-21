package Day3_Inheritance;

public class Super {
    void display(){
        System.out.println("parent class executed");
    }
}
class sub extends Super{
    void display(){
        super.display();
        System.out.println("child class executed");
    }
}
class demo4{
    public static void main(String[] args) {
        sub s=new sub();
        s.display();
    }
}
