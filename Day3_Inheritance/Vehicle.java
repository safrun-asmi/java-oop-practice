package Day3_Inheritance;

public class Vehicle {
    String brand="BMW";
    int speed=2000;
    void honk(){
        System.out.println("vehicle sound");
    }
}
class bmwv1 extends Vehicle{
    void honk(){
        System.out.println("beep beep");
    }
}
class bmwv2 extends Vehicle{
    void honk(){
        System.out.println("room room");
    }
}
class demo1{
    public static void main(String[] args){
    Vehicle v= new bmwv1();
    Vehicle v2=new bmwv2();
    v.honk();
    v2.honk();
    }
}
