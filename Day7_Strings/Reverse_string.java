package Day7_Strings;

public class Reverse_string {
    public static void main(String[] args) {
        String s="safrun";
        int left=0;
        int right=s.length()-1;
        StringBuilder sb=new StringBuilder(s);

        while(left<right){
            char temp=sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(sb.toString());
        StringBuilder sb1=new StringBuilder("safrun");
        System.out.println(sb1.reverse());
        
    }

}
