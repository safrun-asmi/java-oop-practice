package Day6_Keywords;

public class objectCounter {
    static int counter=0;
    objectCounter(){
        counter++;
    }
    static void display(){
        System.out.println("counter:"+counter);
    }
}
class test6{
    public static void main(String[] args) {
        objectCounter obj1=new objectCounter();
        objectCounter obj2=new objectCounter();
        objectCounter obj3=new objectCounter();
        objectCounter obj4=new objectCounter();
        objectCounter obj5=new objectCounter();
        objectCounter.display();
    }
}


