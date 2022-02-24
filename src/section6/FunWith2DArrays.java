package section6;

import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        fill2DArray(arr);
        print2DArray(arr);
        double2DArray(arr);
        print2DArray(arr);
    }
    public static void fill2DArray(int[][] twoDArr){
        Random r = new Random();

        for(int i=0;i<twoDArr.length;i++){
            for(int j=0;j< twoDArr[i].length;j++){
                twoDArr[i][j]=r.nextInt(100);
            }
        }
    }
    public static void print2DArray(int [][] twoDArr){
        for(int[] arr : twoDArr){
            for(int num : arr){
                System.out.print(num+" ");
            }
            System.out.println(" ");
        }
    }
    public static void double2DArray(int [][] twoDArr){
        for(int i=0;i<twoDArr.length;i++){
            for(int j=0;j<twoDArr.length;j++){
                twoDArr[i][j]*=2;
            }
        }
    }
}
