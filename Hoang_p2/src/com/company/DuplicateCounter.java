package com.company;
import java.util.*;
import java.io.*;

import java.io.FileNotFoundException;

public class DuplicateCounter {
    int wordCounter;
    static Map<String, Integer> counter;

    public DuplicateCounter()
    {
        this.counter = new HashMap<String, Integer>();
    }

    public void count(String dataFile) throws FileNotFoundException
    {
        Scanner scnr = new Scanner(new File(dataFile));

        while (scnr.hasNext())
        {
            String word = scnr.next();
            Integer count = counter.get(word);
            wordCounter++;

            if (count != null)
            {
                count += 1;
            }

            else
            {
                count = 1;
            }
            counter.put(word, count);
        }
    }

    public void write(String outputFile) throws IOException
    {
        FileWriter fw = new FileWriter(new File(outputFile));

        fw.write("String" + "\t\tWord Count\n");
        for (Map.Entry<String, Integer> entry : counter.entrySet())
        {
            fw.write(entry.getKey() + ": \t\t" + entry.getValue() + "\n");
        }
        fw.close();

    }
}
