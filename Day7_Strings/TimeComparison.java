package Day7_Strings;

public class TimeComparison {
    public static void main(String[] args) {
         String s1=" ";
         long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
        s1=s1+"a";
        }
        long end=System.currentTimeMillis() ;     
        System.out.println("total time taken by string is: "+(end-start));
    
    StringBuilder sb=new StringBuilder();
    long start1=System.currentTimeMillis();
    for(int i=0;i<10000;i++){
        sb.append("a");
    }
    long end1=System.currentTimeMillis();
    System.out.println("total time taken by string builder is: "+(end1-start1));
}
}
