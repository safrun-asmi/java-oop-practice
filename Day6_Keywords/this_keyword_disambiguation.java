package Day6_Keywords;

public class this_keyword_disambiguation {
    int age;
    this_keyword_disambiguation(int age){
       this. age=age;
    }
}
class test8{
    public static void main(String[] args) {
        this_keyword_disambiguation t=new this_keyword_disambiguation(17);
        System.out.println(t.age);;
    }
}
