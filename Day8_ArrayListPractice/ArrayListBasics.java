package Day8_ArrayListPractice;
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("safrun");
        list.add("asmi");
        list.add("priya");
        list.add("deva");
        list.add("lily");
        list.remove(4);
        list.remove(String.valueOf("safrun"));
        System.out.println(list);
    }
}
