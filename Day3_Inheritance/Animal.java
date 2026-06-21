package Day3_Inheritance;

public class Animal {
    void animal(){
        System.out.println("animal parent executed");
    }
}
class Mammal extends Animal{
    void mammal(){
        System.out.println("mammal is executed");
    }
}
class Dog extends Mammal{
    void dog(){
        System.out.println("dog is executed");
    }
}
class demo2{
    public static void main(String[] args){
        Dog d=new Dog();
        d.animal();
    }
}
