package Day4_Polymorphism;

public class Animal {
    void sound(){
        System.out.println("animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog sound");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat sound");
    }
}
class test2{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}
