package Day4_Polymorphism;

public class Print {
    void printDetails(String name){
        System.out.println("name:"+name);
    }
    void printDetails(String name,int age ){
        System.out.println("name:"+name+" age:"+age);
    }
    void printDetails(String name,int age,double salary){
        System.out.println("name:"+name+" age:"+age+" salary:"+salary);
    }
}
class test4{
    public static void main(String[] args) {
        Print p=new Print();
        p.printDetails("safrun");
        p.printDetails("safrun",21);
        p.printDetails("safrun",12,100000);
    }
}
