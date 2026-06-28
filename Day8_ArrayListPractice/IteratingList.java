package Day8_ArrayListPractice;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratingList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("using for loop");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println("using for each loop");
        for(int ele:list){
            System.out.print(ele);
        }
        System.out.println();
        System.out.println("using iterator");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
