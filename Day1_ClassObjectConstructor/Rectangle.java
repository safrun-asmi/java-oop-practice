public class Rectangle {
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculateperimeter(){
        return 2*(length+width);
    }
    public static void main(String[] args){
        Rectangle r=new Rectangle(4.5,5.5);
        double area=r.calculateArea();
        double perimeter=r.calculateperimeter();
        System.out.println(area+" "+perimeter);
    }
}
