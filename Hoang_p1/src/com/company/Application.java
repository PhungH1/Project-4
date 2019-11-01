package com.company;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.Write("unique_words.txt");
    }
}
