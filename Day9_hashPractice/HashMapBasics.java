package Day9_hashPractice;
import java.util.HashMap;;
public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("safrun",100);
        map.put("asmi",97);
        map.put("priya",92);
        map.put("lily",90);
        map.put("rose",56);
        map.put("asmi",99);
        map.remove("safrun");
        System.out.println(map);
    }
}
