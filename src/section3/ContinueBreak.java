package section3;

public class ContinueBreak {
    public static void main(String[] args) {
        int count=0;
        while(count<10){
            if(count==5){
                count++;
                continue;
            }
            if (count==7){
                break;
            }
            System.out.println(count);
            count++;
        }
    }
}
