package assignment;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Assignment11
{
    public static void main(String[] args) throws IOException
    {
        File f=new File(args[0]);     //Creation of File Descriptor for input file
        FileReader fr=new FileReader(f);   //Creation of File Reader object
        BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object

        int c = 0;
        HashMap<Character,Integer> charCount = new HashMap<>();

        while((c = br.read()) != -1)         //Read char by Char
        {
            char character = (char) c;          //converting integer to char

            if(charCount.containsKey(character))
            {
                charCount.put(character,charCount.get(character)+1);
            }
            else
            {
                charCount.put(character,1);
            }
        }

        FileWriter writer = new FileWriter("outputOfAssignment11.txt");


        for (Map.Entry entry : charCount.entrySet()) {
            writer.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        writer.close();
    }
}
