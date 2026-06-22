package Day4_Polymorphism;

public class Shape {
    void CalculateArea(int radius){
        System.out.println(3.14*radius*radius);
    }
    void CalculateArea(int length,int breadth){
        System.out.println(length*breadth);
    }
    void CalculateArea(double base,double height){
        System.out.println(0.5*base*height);
    }
}
class test3{
    public static void main(String[] args) {
        Shape s=new Shape();
        s.CalculateArea(4);
        s.CalculateArea(4,5);
        s.CalculateArea(4.5,2.5);
    }
}
