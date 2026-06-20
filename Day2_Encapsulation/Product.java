package Day2_Encapsulation;

public class Product {
    private int price;
    private int stock=9;
    public void setPrice(int price){
        if(price<0){
            System.out.println("invalid price");
        }else{
            this.price=price;
        }
    }
    public void reduceStock(int demand){
        if(stock<demand){
            System.out.println("request rejected");
        }else{
            stock-=demand;
        }
    }
    void display(){
        System.out.println("stock: "+stock+" price: "+price);
    }
}
class test4{
    public static void main(String[] args){
        Product p=new Product();
        p.setPrice(170);
        p.reduceStock(7);
        p.display();
    }
}
