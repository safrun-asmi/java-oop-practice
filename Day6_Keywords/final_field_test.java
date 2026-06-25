package Day6_Keywords;

public class final_field_test {
    final int x;
    final_field_test(int x){
        this.x=x;
    }
}
class test7{
    public static void main(String[] args) {
        final_field_test f=new final_field_test(7);
        f.x=8;
        
    }
}