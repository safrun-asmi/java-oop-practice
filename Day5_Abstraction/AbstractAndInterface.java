package Day5_Abstraction;
abstract class Animal{
    String color="red";
    abstract void dog();
}
interface runnable{
    void run();
}
public class AbstractAndInterface extends Animal implements runnable {
    public void dog(){
        System.out.println("dog is an animal and its color is "+color);
    }
    public void run(){
        System.out.println("dog is running ");
    }
}
class test6{
    public static void main(String[] args) {
        AbstractAndInterface a=new AbstractAndInterface();
        a.dog();
        a.run();
    }
}
