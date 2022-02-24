package section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc=new Scanner(new File("input.txt"));
            while (sc.hasNext()){
                int i = sc.nextInt();
                System.out.println(i);
            }
            sc.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Can't find the file");
            System.out.println(ex.getMessage());
        }
    }
}
