package Day4_Polymorphism;

public class Calculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
class test1{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(4,5);
        c.add(2.5,3.5);
        c.add(4,5,6);
    }
}
