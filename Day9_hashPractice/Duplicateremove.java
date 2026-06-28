package Day9_hashPractice;
import java.util.HashSet;
public class Duplicateremove {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
