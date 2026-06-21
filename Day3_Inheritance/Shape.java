package Day3_Inheritance;

public class Shape {
    String color;
    void display(){
        System.out.println("shape executed");
    }
}
class circle extends Shape{
    circle(){
        this.color="red";
    }
    int radius=2;
    void displayinfo(){
        super.display();
        System.out.println("color:"+color+" radius:"+radius);
    }
}
class square extends Shape{
    square(){
        this.color="blue";
    }
    int side=4;
    void displayinfo(){
        
        System.out.println("color:"+color+" side:"+side);

    }
}
class demo{
    public static void main(String[] args){
    square s=new square();
    circle s2=new circle();
    s.displayinfo();
    s2.displayinfo();
    }
}
