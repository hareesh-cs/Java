package section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriterNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hareesh");
        names.add("Raghuraj");
        names.add("Rohith");
        try {
            PrintWriter pw=new PrintWriter("names.txt");
            for(String name:names)
                pw.println(name);
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
            System.out.println("Error: "+ex.getMessage());
        }

    }
}
