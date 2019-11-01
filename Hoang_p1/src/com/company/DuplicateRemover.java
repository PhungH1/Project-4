package com.company;
import java.io.*;
import java.util.*;

public class DuplicateRemover {
    static Set<String> uniqueWords;

    public void remove(String dataFile) throws FileNotFoundException
    {
        uniqueWords = new HashSet<String>();
        Scanner scnr = new Scanner(new File(dataFile));

        while(scnr.hasNext())
        {
            String dupes = scnr.next();
            uniqueWords.add(dupes);
        }
        scnr.close();
    }

    public void Write(String outputFile) throws IOException
    {
        File f = new File(outputFile);
        f.createNewFile();
        FileWriter write = new FileWriter(f);
        Iterator itr = uniqueWords.iterator();

            while(itr.hasNext())
            {
                String str = (String)itr.next();
                write.write(str + "\n");
            }
            write.close();
    }
}
