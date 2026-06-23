package Day5_Abstraction;

abstract public class Shape {
    String color;

    abstract void calculateArea( );
    void displayColor(){
        System.out.println("color:"+color);
    }
}
class circle extends Shape{
    int radius;
    circle(int radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public void calculateArea(){
        System.out.println("Area of circle:"+3.15*radius*radius);
    }
}
class rectangle extends Shape{
    int length;
    int breadth;
    rectangle(int length,int breadth,String color){
        this.length=length;
        this.breadth=breadth;
        this.color=color;
    }
    public void calculateArea(){
        System.out.println("Area of rectangle:"+length*breadth);
    }
}
class Test1{
    public static void main(String[] args) {
        circle c=new circle(3, "blue");
        rectangle r=new rectangle(2, 2, "green");
        c.displayColor();
        c.calculateArea();
        r.displayColor();
        r.calculateArea();
    }
}