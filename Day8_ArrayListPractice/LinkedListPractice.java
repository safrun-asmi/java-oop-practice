package Day8_ArrayListPractice;
import java.util.LinkedList;
public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(1);
        System.out.println(ll);
        ll.addLast(1);
        System.out.println(ll);
        ll.addLast(3);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
