package Day2_Encapsulation;

public class Person {
    private int age=1;
    public void setAge(int age){
        if(age<=0 || age>=120){
            System.out.println("enter valid age");
        }else{
        this.age=age;
        }
    }
    public String toString(){
        return "age: "+age;
    }
}
class test2{
    public static void main(String[] args){
    Person p=new Person();
    p.setAge(188);
    System.out.println(p);
    }
}
