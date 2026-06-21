package Day3_Inheritance;

public class Employee {
    String name;
    int id;
}
class Manager extends Employee{
    Manager(){
        super();
        this.name="safrun";
        this.id=212;
    }
    int teamSize=4;
    void display(){
        System.out.println("name:"+name+" id:"+id+" teamsize:"+teamSize);
    }
}
class demo3{
    public static void main(String[] args) {
        Manager e=new Manager();
        e.display();
    }
}
