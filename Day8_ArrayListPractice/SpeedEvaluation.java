package Day8_ArrayListPractice;
import java.util.ArrayList;
import java.util.LinkedList;
public class SpeedEvaluation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            list.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println("total time taken by arraylist: "+(end-start));
        long start1=System.currentTimeMillis();
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=0;i<10000;i++){
            ll.addFirst(i);
        }
        long end1=System.currentTimeMillis();
        System.out.println("total time taken by arraylist: "+(end1-start1));
    }
}
