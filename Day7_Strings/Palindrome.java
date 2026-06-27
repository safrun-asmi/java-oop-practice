package Day7_Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s="Mam";
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        boolean ispalindrome=true;
        while(left<right){
            if(s.charAt(left)!=(s.charAt(right))){
                ispalindrome=false;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
