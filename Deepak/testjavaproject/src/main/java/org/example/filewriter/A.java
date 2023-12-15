package org.example.filewriter;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class A {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("D:\\Deepak.txt");
            String content = "Welcome to slk";
            w.write(content);
            w.close();
            System.out.println("content added to the file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
