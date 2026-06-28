package Day9_hashPractice;
import java.util.HashMap;;
public class Contains {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("safrun",100);
        map.put("asmi",97);
        map.put("priya",92);
        map.put("lily",90);
        map.put("rose",56);
        map.put("asmi",99);
        if(map.containsKey("safrun")){
            System.out.println("safrun exist");
        }else{
            System.out.println("safrun not exist");
        }
        if(map.containsKey("deva")){
            System.out.println("deva exist");
        }else{
            System.out.println("deva not exist");
        }
        if(map.containsValue(99)){
            System.out.println("someone has score 99");
        }else{
            System.out.println("no one has scored 99");
        }
        if(map.containsValue(86)){
            System.out.println("someone has score 86");
        }else{
            System.out.println("no one has scored 86");
        }
    }
}
