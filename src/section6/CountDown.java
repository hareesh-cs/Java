package section6;

public class CountDown {
    public static void main(String[] args) {
        countDown(10);
        countUpto(11,23);
    }
    public static void countDown(int n ){
        if(n>=0){
            System.out.println(n);
            countDown(n-1);
        }
    }

    public static void countUpto(int start, int end){
        if(start<=end){
            System.out.println(start);
            countUpto(start+1,end);
        }
    }
}