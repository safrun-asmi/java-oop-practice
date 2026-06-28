package Day9_hashPractice;
import java.util.HashMap;;
public class CountFrequency {
    public static void main(String[] args) {
        String sentence="i am safrun and safrun is very good girl and very beautiful girl";
        String[] arr=sentence.split("\\s+");
       HashMap<String,Integer> map=new HashMap<>();
       for(String word:arr){
        map.put(word,map.getOrDefault(word,0)+1);
       }
       System.out.println(map);
    }
}
