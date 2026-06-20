package Day2_Encapsulation;
import java.util.*;
public class Marks {
    private int[] arr={100,99,89};
    public int[] getMarks(){
        return arr.clone();
    }
    void display(){
        System.out.println(Arrays.toString(arr));
    }
}
class test3{
    public static void main(String[] args){
        Marks m=new Marks();
        int[] arr1=m.getMarks();
        arr1[0]=66;
        m.display();
    }
}
