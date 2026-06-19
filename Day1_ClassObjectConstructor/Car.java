public class Car {
    String brand;
    String model;
    int year;
    public  Car(){

    }
    public  Car(String brand,String model,int  year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public String toString(){
        return brand+" "+model+" "+year;
    }
    public static void main(String[] args){
        Car c1=new Car();
        Car c2=new Car("bmw","gt20",2006);
        System.out.println(c1);
        System.out.println(c2);
    }
}
